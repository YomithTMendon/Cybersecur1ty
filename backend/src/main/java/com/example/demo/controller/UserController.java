package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    public String getUser(@RequestParam String name) {
        return "Hello " + name;
    }
}
