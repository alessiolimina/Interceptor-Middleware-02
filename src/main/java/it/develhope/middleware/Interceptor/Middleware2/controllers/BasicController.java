package it.develhope.middleware.Interceptor.Middleware2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @GetMapping("/root")
    public String welcomeUser(@RequestParam String name){
        return "Welcome, " + name;
    }
}
