package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@GetMapping("/tasks/{id}")
public Task getTaskById(@PathVariable int id) {
    for (Task task : tasks) {
        if (task.getId() == id) {
            return task;
        }
    }
    return null;
}
@DeleteMapping("/tasks/{id}")
public Task deleteId(@PathVariable int id){
   for(int i = 0; i < tasks.size(); i ++){
    if(tasks.get(i).getId() == id){
        return tasks.remove(i);
    }
   }
   return null;
}
@PutMapping("/tasks/{id}")
public Task putId(@RequestBody Task updatedTask, @PathVariable  int id){
  for(Task task : tasks){
    if (task.getId() == id){
          task.setName(updatedTask.getName());
            task.setTask(updatedTask.getTask());
            task.setCompleted(updatedTask.isCompleted());
            return task;
    }
  }
  return null;
    }
  }
 




