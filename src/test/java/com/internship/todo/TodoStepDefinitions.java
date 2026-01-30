package com.internship.todo;

import com.internship.todo.service.TodoService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TodoStepDefinitions {

    @Autowired
    private TodoService todoService;

    @Given("the todo list is empty")
    public void the_todo_list_is_empty() {
        // H2 is fresh every test run by default
    }

    @When("I add a task named {string}")
    public void i_add_a_task_named(String taskName) {
        todoService.addTask(taskName);
    }

    @Then("I should see {string} in my active tasks")
    public void i_should_see_in_my_active_tasks(String taskName) {
        boolean found = todoService.getActiveTasks().stream()
                .anyMatch(todo -> todo.getDescription().equals(taskName));
        assertTrue(found);
    }
}