# DevSecOps Project: Spring Boot Employee Management System

Welcome to the **DevSecOps Spring Boot Employee Management System**!

---
## ⚙️ Tech Stack

- **Java 11+**: Core language for backend logic.
- **Spring Boot**: Quick and robust web framework.
- **Maven**: Dependency management and build automation.

## 📂 Project Structure

- **`src/main/java/gestionemploye/exam/`**: Core backend code.
  - **Entity**: User entity and mapping configurations.
  - **Service**: Business logic with `UserService` and `UserServiceImpl`.
  - **Controller**: REST endpoints in `UserController`.
  - **Repository**: `UserRepository` for database interactions.
- **`src/main/resources/`**: Configuration files.
- **`src/test/java/gestionemploye/exam/`**: Unit and integration tests.

## 🚀 Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/rekkles0/devsecops.git
   cd devsecops-project

2. **Run the Application**:
   ```bash
   ./mvnw spring-boot:run
