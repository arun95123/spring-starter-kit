package com.qdex.reflection;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qdex.reflection.api.MethodsApi;

@RestController
public class MethodController implements MethodApi{
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
