//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mvn.springMvcServlet.controller;

import com.mvn.springMvcServlet.Service.IDetail;
import com.mvn.springMvcServlet.Service.IMail;
import com.mvn.springMvcServlet.Service.IUser;
import com.mvn.springMvcServlet.model.DetailMail;
import com.mvn.springMvcServlet.model.Mail;
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
@RequestMapping({"/home/compose"})
public class MailController {
    @Autowired
    IUser dbUser;
    @Autowired
    IMail dbMail;
    @Autowired
    IDetail dbDetail;
    @Autowired
    HttpSession session;

    public MailController() {
    }

    @GetMapping({""})
    public String index() {
        User user = (User)this.session.getAttribute("currentUser");
        return user == null ? "redirect:/login" : "/compose/index";
    }

    @PostMapping
    public String compose(@RequestParam("subject") String subject, @RequestParam("email") String Email, @RequestParam("body") String Body, Model model) {
        User receiver = this.dbUser.findUserByMailAddress(Email);
        if (receiver == null) {
            model.addAttribute("error", "Mail is not exists");
            return "/compose/index";
        } else {
            User sender = (User)this.session.getAttribute("currentUser");
            Mail mail = new Mail();
            mail.setSubject(subject);
            mail.setBody(Body);
            mail.setMailAddressReceiver(Email);
            mail.setSenderID(sender.getId());
            mail.setReceiverID(receiver.getId());
            this.dbMail.save(mail);
            DetailMail detail = new DetailMail();
            detail.setMailID(mail.getId());
            detail.setSenderID(sender.getId());
            detail.setReceiverID(receiver.getId());
            this.dbDetail.save(detail);
            return "redirect:/home";
        }
    }
}
