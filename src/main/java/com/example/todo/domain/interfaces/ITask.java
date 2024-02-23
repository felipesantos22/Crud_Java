package com.example.todo.domain.interfaces;

import com.example.todo.domain.entity.Task;

import java.util.List;
import java.util.Optional;

public interface ITask {

    public Task create(Task task);
    public List<Task> findAll();
    public Optional<Task> findById(int id);
    public Optional<Task> update(int id, Task task);
    public Optional<Task> delete(int id);

}
