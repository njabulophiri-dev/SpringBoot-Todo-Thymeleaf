package com.njabulophiri.todo.repository;

import com.njabulophiri.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
