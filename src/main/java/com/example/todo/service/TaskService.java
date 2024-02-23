package com.example.todo.service;

import com.example.todo.domain.entity.Task;
import com.example.todo.domain.interfaces.ITask;
import com.example.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService implements ITask {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> update(int id, Task task) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> delete(int id) {
        return Optional.empty();
    }
}
