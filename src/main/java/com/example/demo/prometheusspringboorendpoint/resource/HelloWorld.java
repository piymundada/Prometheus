package com.example.demo.prometheusspringboorendpoint.resource;

import io.prometheus.client.Counter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
}
