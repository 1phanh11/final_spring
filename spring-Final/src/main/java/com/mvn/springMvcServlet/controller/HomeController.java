//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mvn.springMvcServlet.controller;

import com.mvn.springMvcServlet.Service.IDetail;
import com.mvn.springMvcServlet.Service.IMail;
import com.mvn.springMvcServlet.Service.IUser;
import com.mvn.springMvcServlet.model.Mail;
import com.mvn.springMvcServlet.model.User;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/home"})
public class HomeController {
    @Autowired
    IUser dbUser;
    @Autowired
    IMail dbMail;
    @Autowired
    IDetail dbDetail;
    @Autowired
    HttpSession session;

    public HomeController() {
    }

    @GetMapping({""})
    public String index(Model model) {
        User user = (User)this.session.getAttribute("currentUser");
        if (user == null) {
            return "redirect:/login";
        } else {
            List<Mail> listMail = this.dbMail.findAll();
            List<Mail> listMailOfUser = new ArrayList();
            Iterator var5 = listMail.iterator();

            while(var5.hasNext()) {
                Mail m = (Mail)var5.next();
                if (m.getSenderID() == user.getId()) {
                    listMailOfUser.add(m);
                } else if (m.getReceiverID() == user.getId()) {
                    listMailOfUser.add(m);
                }
            }

            model.addAttribute("listMail", listMailOfUser);
            model.addAttribute("mailCount", listMailOfUser.size());
            model.addAttribute("currentUserMail", user.getMailAddress());
            model.addAttribute("currentUserName", user.getUserName());
            return "/home/mail";
        }
    }

    @GetMapping({"/sent"})
    public String sent(HttpSession session, Model model) {
        User sender = (User)session.getAttribute("currentUser");
        if (sender == null) {
            return "redirect:/login";
        } else {
            List<Mail> listMainSend = this.dbMail.findMailBySenderID(sender.getId());
            model.addAttribute("listMail", listMainSend);
            model.addAttribute("mailCount", listMainSend.size());
            return "/home/sent";
        }
    }
}
