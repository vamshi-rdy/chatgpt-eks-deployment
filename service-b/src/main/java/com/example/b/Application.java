package com.example.b;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/b")
    public String serviceB() {
        return "Hello from Service B";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
