package com.jwt.JwtExample.controllers;

import com.jwt.JwtExample.models.User;
import com.jwt.JwtExample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getCurrentTime() {
        return "Hi, Time now: " + LocalDateTime.now();
    }

    @GetMapping("/user")
    public List<User> getUser() {
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggerInUser(Principal principal) {
        return principal.getName();
    }

}
