package com.internship.todo.service;

import com.internship.todo.model.Todo;
import com.internship.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getActiveTasks() {
        return todoRepository.findByCompletedFalse();
    }

    public List<Todo> getCompletedTasks() {
        return todoRepository.findByCompletedTrue();
    }

    public void addTask(String description) {
        Todo todo = new Todo();
        todo.setDescription(description);
        todo.setCompleted(false);
        todoRepository.save(todo);
    }

    public void completeTask(Long id) {
        todoRepository.findById(id).ifPresent(todo -> {
            todo.setCompleted(true);
            todoRepository.save(todo);
        });
    }
}