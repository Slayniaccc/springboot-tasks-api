package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    ArrayList<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}