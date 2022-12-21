package com.mvn.springMvcServlet.controller;

import com.mvn.springMvcServlet.Service.IUser;
import com.mvn.springMvcServlet.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login/register")
public class RegisterController {

    @Autowired
    IUser dbUser;
    @Autowired
    HttpSession session;

    @GetMapping("")
    public String register(){
        return "login/register";
    }

    @PostMapping
    public String register(@RequestParam("username") String userName, @RequestParam("email") String email,
                           @RequestParam("password") String password, @RequestParam("confirmpassword") String cfp,
                           @RequestParam("phone") int phone, Model model
    ){
        model.addAttribute("user", userName);
        model.addAttribute("pass", password);
        model.addAttribute("confirm", cfp);
        model.addAttribute("phone", phone);
        model.addAttribute("email", email);

        if(dbUser.findUserByUserName(userName) != null){
            model.addAttribute("error1", "user name used by another user");
            return "login/register";
        } else if (dbUser.findUserByMailAddress(email) != null) {
            model.addAttribute("error2", "email user is exist");
            return "login/register";
        }else if (password.length() < 6) {
            model.addAttribute("error3", "password length must larger than 6 character");
            return "login/register";
        }else if (!password.equals(cfp)) {
            model.addAttribute("error4", "password confirm must same with password");
            return "login/register";
        }else{
            User newU = new User();
            newU.setMailAddress(email);
            newU.setPassWord(password);
            newU.setUserName(userName);
            dbUser.save(newU);
            model.addAttribute("success", "successes register");
            return "login/register";
        }
    }
}
