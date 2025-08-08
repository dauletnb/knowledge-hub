package com.example.knowledgehub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! Мой первый Spring Boot API работает!";
    }

    @GetMapping("/api/info")
    public ApiInfo getApiInfo() {
        return new ApiInfo(
                "Knowledge Hub API",
                "1.0.0",
                "REST API для управления учебными заметками",
                "Твое имя"
        );
    }

    @GetMapping("/api/status")
    public AppStatus CheckStatus() {
        return new AppStatus(
                "running",
                "5 minutes",
                "connected"
        );
    }
}
