package com.example.a;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {
    @GetMapping("/health")
    public String health() { return "OK"; }
    @GetMapping("/a")
    public String serviceA() { return "Hello from Service A"; }
    public static void main(String[] args) { SpringApplication.run(Application.class, args); }
}
