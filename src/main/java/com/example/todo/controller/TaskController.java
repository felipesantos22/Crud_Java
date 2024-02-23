package com.example.todo.controller;

import com.example.todo.domain.entity.Task;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public Task create(@RequestBody Task task){
        return taskService.create(task);
    }

    @GetMapping
    public List<Task> findAll(){
        return taskService.findAll();
    }
}
