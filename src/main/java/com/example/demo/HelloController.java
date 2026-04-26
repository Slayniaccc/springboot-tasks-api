package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    ArrayList<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    @PostMapping("/tasks")
public Task postTask(@RequestBody Task task) {
    tasks.add(task);
    return task;
}
}