package org.kol.thymleafPublishInWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class HomeController {
    @GetMapping("/test")
    public String homePage() {


        return "Home"; // Points to home.html
    }
}
