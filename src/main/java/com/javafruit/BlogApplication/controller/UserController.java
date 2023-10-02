package com.javafruit.BlogApplication.controller;

import com.javafruit.BlogApplication.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(Model model)
    {
        log.info("Entered :: ");
        model.addAttribute("users", userService.getUserDetails());
        return "index";
    }
}
