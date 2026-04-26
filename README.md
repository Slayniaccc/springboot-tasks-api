# Spring Boot Tasks API

This is a simple REST API I built using Spring Boot to practice backend development.

## Features

- GET /tasks → get all tasks
- GET /tasks/{id} → get a task by id
- POST /tasks → create a new task

## Example request

```json
{
  "name": "Abdi",
  "task": "Revise APIs",
  "completed": false
}