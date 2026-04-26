package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
int nextId = 1;
    ArrayList<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    @PostMapping("/tasks")
public Task postTask(@RequestBody Task task) {
    task.setId(nextId);
    nextId++;
    tasks.add(task);
    return task;
}
}