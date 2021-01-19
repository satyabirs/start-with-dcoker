package com.personal.docker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public String getMessage()
    {
        return "Hello from docker container";
    }
}
