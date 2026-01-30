Feature: Todo Management
  As a user
  I want to manage my tasks
  So that I can stay organized

  Scenario: Adding a new task
    Given the todo list is empty
    When I add a task named "Finish Cucumber Tests"
    Then I should see "Finish Cucumber Tests" in my active tasks