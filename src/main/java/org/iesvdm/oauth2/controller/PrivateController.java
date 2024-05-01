package org.iesvdm.oauth2.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private")
public class PrivateController {

    @GetMapping({"/messages", "/messages/"})
    public String privateMessages(Model model, @AuthenticationPrincipal OAuth2User oAuth2User) {

        model.addAttribute("body", "" + oAuth2User.getAttribute("name") + oAuth2User.getAttribute("email"));

        return "response";
    }
}
