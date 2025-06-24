package com.example.todoservice.controller;

import com.example.todoservice.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        // This is a placeholder for the actual implementation.
        // In a real application, you would fetch the todos from a database or another service.
        return List.of(
            new Todo( "Learn Spring Boot", false),
            new Todo("Build a REST API", true),
                new Todo("Deploy to production", false)
        );
    }
}
