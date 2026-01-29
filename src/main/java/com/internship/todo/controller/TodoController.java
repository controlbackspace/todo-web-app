package com.internship.todo.controller;

import com.internship.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String index(Model model) {
        return refreshLists(model, "index");
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String description, Model model) {
        todoService.addTask(description);
        // Returns the fragment for HTMX to swap
        return refreshLists(model, "index :: #todo-app-container");
    }

    @PostMapping("/complete/{id}")
    public String completeTask(@PathVariable Long id, Model model) {
        todoService.completeTask(id);
        // Returns the fragment for HTMX to swap
        return refreshLists(model, "index :: #todo-app-container");
    }

    private String refreshLists(Model model, String viewName) {
        model.addAttribute("activeTasks", todoService.getActiveTasks());
        model.addAttribute("completedTasks", todoService.getCompletedTasks());
        // Use 'innerHTML' in the HTML and return the content of the row
        if (viewName.contains("::")) {
            return "index :: #todo-app-content";
        }
        return viewName;
    }
}