# SpringBootDemo

### Introduction to Spring Boot

Spring Boot is an open-source framework based on the Spring framework, designed to simplify the initial setup and development process of Spring applications. By providing a convention-over-configuration approach, it minimizes the workload for developers, making Spring application development faster, easier, and more efficient.

#### Key features of Spring Boot include:
1. **Simplified Configuration**: Spring Boot follows the convention-over-configuration principle, reducing the need for extensive configurations typically required in traditional Spring applications. It simplifies the setup process through **auto-configuration** and **starter dependencies**, allowing developers to quickly create a runnable Spring application.
2. **Strong Integration**: Spring Boot offers a wide range of out-of-the-box features and functionality, such as embedded Servlet containers (like Tomcat, Jetty, or Undertow), health checks, and metrics monitoring. It also integrates many popular libraries and frameworks, such as Spring Data and Spring Security, enabling developers to quickly build feature-rich applications.
3. **Microservices Support**: Spring Boot is well-suited for building microservice architectures. It provides rich support for developing microservices through **Spring Cloud**, integrating features like service discovery, configuration management, and load balancing, helping developers build scalable, highly available microservices systems.
4. **Embedded Server**: Spring Boot allows applications to be packaged into an executable JAR file with an embedded Servlet container (such as Tomcat, Jetty, or Undertow). This enables developers to run applications using a simple `java -jar` command without needing to deploy them on an external application server.
5. **Rich Ecosystem**: Due to the widespread use of Spring Boot and its strong ecosystem, developers can easily utilize various extensions and plugins, such as **Actuator** and **Spring Boot DevTools**, to improve development efficiency and application quality.

---
### Demo Structure
<p align="center">
  <img width="500" alt="image" src="https://github.com/user-attachments/assets/96da8b87-328b-4ad6-8dff-4a4c34ca6a55">
</p>

---
### REST API Specification

#### Path
The path, also known as the "endpoint," represents the specific URL of an API.  
In a RESTful architecture, each URL represents a resource, so URLs should not contain verbs, only nouns. These nouns often correspond to database table names.

#### HTTP Verbs
- **GET (SELECT)**: Retrieve one or more resources from the server.
- **POST (CREATE)**: Create a new resource on the server.
- **PUT (UPDATE)**: Update a resource on the server (the client provides the complete updated resource).
- **PATCH (UPDATE)**: Partially update a resource on the server (the client provides only the attributes that need to be updated).
- **DELETE (DELETE)**: Remove a resource from the server.

---
### Creating Database Tables

#### SQL Statement to Create a Database
```sql
CREATE DATABASE test
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_general_ci;
```

#### SQL Statement to Create a Table
```sql
CREATE TABLE student (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  age INT
);
```
---
