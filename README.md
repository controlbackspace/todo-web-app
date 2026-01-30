# Todo Web App (Java 21 & HTMX)

A modern, server-driven Todo web application built with Java 21, Spring Boot, and HTMX.  
This project demonstrates clean backend architecture, database versioning, and SPA-like interactivity **without custom JavaScript**.

---

## 🚀 Demo

![Application Demo](demo.gif)

---

## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot 3.4.1 (Jakarta EE)
- **Database:** H2 (In-Memory Persistence)
- **Migration:** Liquibase (Database Version Control)
- **Frontend:** Thymeleaf + HTMX (Server-Side Interactivity)
- **Styling:** Bootstrap 5.3
- **Build Tool:** Maven 3.9+

---

## 🏗️ Architecture & Learning Journey

This project evolved through a strict **“Architecture First”** approach:

1. **Legacy Modernization**  
   Upgraded from Spring Boot 1.2 to 3.4.1 to ensure Java 21 compatibility and complete Jakarta EE migration.

2. **Encapsulation & Domain Modeling**  
   Implemented a robust `Todo` domain model with private fields and public accessors to enforce data integrity.

3. **Persistence & Version Control**  
   Configured Liquibase to automatically manage the `todos` table:
   - `id`
   - `description`
   - `completed`

4. **HTMX Integration**  
   Used partial HTML fragment swapping (`hx-target`, `hx-swap`) to achieve a Single Page App (SPA) feel without writing custom JavaScript.

---

## 📋 Features

- **Active Task Management**  
  Add new tasks using an HTMX-powered form.

- **State Persistence**  
  Completed tasks move to a “History” column and persist across application restarts.

- **Responsive UI**  
  Clean, centered layout using Bootstrap 5.3.

---

## 🚦 Getting Started

### Prerequisites

- **JDK 21**
- **Maven 3.9+**

---

## 📥 Installation

Clone the repository: https://github.com/controlbackspace/todo-web-app.git


## ▶️ Running the Application
./mvnw spring-boot:run
mvn spring-boot:run

##🌐 Access the Application

Open your browser and navigate to: http://localhost:8080

## 🧪 Testing

To run both JUnit and Cucumber tests (used for acceptance testing): ./mvnw test or mvn test

## 📦 Project Dependencies
Framework & Core

Spring Boot Starter Web
Provides the embedded web server and MVC infrastructure.

Spring Boot Starter Data JPA
Manages ORM and database communication.

Thymeleaf
Server-side template engine for rendering HTML views.

## Frontend Enhancement

HTMX
Enables AJAX-style requests and partial page updates directly from HTML attributes.

## Database Management

- H2 Database
In-memory database for development and testing.

- Liquibase Core
Handles schema versioning and database migrations.

## Testing Suite

- Spring Boot Starter Test
Includes JUnit 5, Mockito, and AssertJ.

- Cucumber (Java & JUnit Platform Engine)
Enables Behavior-Driven Development using Gherkin feature files.

- JUnit Platform Suite
Required to group and execute Cucumber scenarios as a unified test suite.




