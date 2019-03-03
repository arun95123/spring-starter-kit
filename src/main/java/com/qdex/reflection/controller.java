package com.qdex.reflection;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class controller {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
