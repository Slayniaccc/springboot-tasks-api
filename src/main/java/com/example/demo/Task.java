package com.example.demo;

public class Task {
    private String name;
    private String task;
    private boolean completed;
    private int id;

    public Task() {}

    public String getName() { return name; }
    public String getTask() { return task; }
    public boolean isCompleted() { return completed; }
    public int getId() { return id; }

    public void setName(String name) { this.name = name; }
    public void setTask(String task) { this.task = task; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public void setId(int id) { this.id = id; }
}