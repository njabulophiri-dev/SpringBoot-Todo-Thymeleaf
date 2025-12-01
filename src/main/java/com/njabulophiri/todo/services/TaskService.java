package com.njabulophiri.todo.services;

import com.njabulophiri.todo.models.Task;
import com.njabulophiri.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        //Fetching tasks from Database
        return taskRepository.findAll();

    }
}
