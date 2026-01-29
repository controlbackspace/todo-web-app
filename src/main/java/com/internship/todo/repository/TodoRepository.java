package com.internship.todo.repository;

import com.internship.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByCompletedFalse();
    List<Todo> findByCompletedTrue();
}