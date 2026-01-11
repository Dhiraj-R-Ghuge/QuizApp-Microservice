# Quiz App Microservice 🚀

A Spring Boot based **Quiz Application Microservice Architecture** using  
**Eureka Server**, **Feign Client**, and **REST APIs**.

---

## 🧩 Microservices Overview

This project is divided into multiple independent microservices:

### 1️⃣ Eureka Server
- Service Discovery Server
- Registers all microservices
- Enables dynamic service lookup

### 2️⃣ Quiz Service
- Manages quizzes
- Communicates with Question Service using **Feign Client**
- Calculates quiz results

### 3️⃣ Question Service
- Manages questions
- Stores and retrieves questions from database
- Exposes REST APIs

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Cloud Netflix Eureka**
- **Spring Cloud OpenFeign**
- **Spring Data JPA**
- **Hibernate**
- **MySQL / H2**
- **Maven**

---

## 🔗 Service Communication

- **Feign Client** is used for inter-service communication
- Services communicate using **service name**, not hardcoded URLs
- Eureka handles load balancing & discovery


