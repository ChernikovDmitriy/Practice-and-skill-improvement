package com.baeldung.ls.persistence.service;

import com.baeldung.ls.persistence.model.Task;
import com.baeldung.ls.persistence.repository.TaskRepository;

import java.util.Optional;


public class TaskServiceImpl implements ITaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task save(Task project) {
        return taskRepository.save(project);
    }
}