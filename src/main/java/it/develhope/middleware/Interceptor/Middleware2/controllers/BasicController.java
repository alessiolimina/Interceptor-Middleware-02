package it.develhope.middleware.Interceptor.Middleware2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class BasicController {

    public String welcomeUser(@RequestParam String name){
        return "Welcome, " + name;
    }
}
