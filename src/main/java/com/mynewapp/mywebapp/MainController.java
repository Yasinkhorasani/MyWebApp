package com.mynewapp.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/yasin")
    public String showHomePage(){
        return "index";
    }
}
