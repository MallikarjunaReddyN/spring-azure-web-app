package com.malli.springazurewebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/test")
    public String welcome() {
        return "Welcome to Spring azure we app";
    }

}
