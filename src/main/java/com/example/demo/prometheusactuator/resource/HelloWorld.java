package com.example.demo.prometheusactuator.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
}
