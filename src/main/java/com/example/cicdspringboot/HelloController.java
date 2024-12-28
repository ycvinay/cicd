package com.example.cicdspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Dockerized Spring boot Application";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye to Dockerized Spring Boot Application";
    }
}
