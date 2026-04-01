package com.example.springbootlab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootLab6Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLab6Application.class, args);
    }

    @GetMapping("/")
    public String rootEndpoint() {
        return "Hello, world!";
    }

    @GetMapping("/hello")
    public String helloEndpoint(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}