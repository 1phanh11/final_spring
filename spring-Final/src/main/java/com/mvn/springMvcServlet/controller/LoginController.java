//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mvn.springMvcServlet.controller;

import com.mvn.springMvcServlet.Service.IUser;
import com.mvn.springMvcServlet.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping({"/login"})
@Controller
public class LoginController {
    @Autowired
    IUser dbUser;
    @Autowired
    HttpSession session;

    public LoginController() {
    }



    @GetMapping({""})
    public String index() {
        if(this.session.getAttribute("currentUser") != null){
            return "redirect:/home";
        }
        return "login/index";
    }

    @PostMapping
    public String login(@RequestParam("email") String email, @RequestParam("password") String passWord, Model model) {
        User user = this.dbUser.findUserByMailAddress(email);
        if (user != null) {
            this.session.setAttribute("currentUser", user);
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Wrong user name or password");
            model.addAttribute("userMail", email);
            model.addAttribute("pass", passWord);
            return "/login/index";
        }
    }

    @GetMapping("/logout")
    public String logOut(){
        session.removeAttribute("currentUser");
        return "redirect:/login";
    }
}
