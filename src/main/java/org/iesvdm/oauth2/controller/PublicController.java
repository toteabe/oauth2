package org.iesvdm.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class PublicController {

    @GetMapping({"/messages", "/messages/"})
    public String publicMessages(Model model) {

        model.addAttribute("body", "Esto es un mensaje público");

        return "response";
    }

}
