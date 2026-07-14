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
public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
    Task savedTask = taskService.save(task); 
    return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
}
//returns 404 if not found
@GetMapping("/tasks/{id}")
public ResponseEntity<Task> getTask(@PathVariable Long id) {
    Task task = taskService.findById(id);
    if (task == null) {
         return ResponseEntity.ok(task);
    }
    return ResponseEntity.notFound().build();

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
public ResponseEntity<Task> updateTask(@PathVariable int id, @Valid @RequestBody Task updatedTask){
  for(Task task : tasks){
    if (task.getId() == id){
          task.setName(updatedTask.getName());
            task.setTask(updatedTask.getTask());
            task.setCompleted(updatedTask.isCompleted());
            return responseEntity.ok(task);
    }
  }
 return ResponseEntity.notFound().build();
    }
  }
 




