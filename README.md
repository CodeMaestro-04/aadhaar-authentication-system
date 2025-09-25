# Aadhaar Management & Authentication System

A Spring Boot backend project for managing **Person** and **Aadhaar** data with full **CRUD operations** and a simple **authentication API**.  
Built with **Spring Boot, Spring Data JPA, Hibernate, and MySQL**.

---

## 🚀 Features
- CRUD operations for **Aadhaar** (save, update, delete, fetch single, fetch all)
- CRUD operations for **Person** with Aadhaar one-to-one mapping
- Aadhaar authentication API (`anum + address` check)
- RESTful API tested using **Postman**
- Database integration with **MySQL** and Hibernate ORM

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **Postman** (for API testing)

---
💡 Notes
This is a backend-only project (no frontend).
APIs are tested using Postman.
Demonstrates Spring Boot, REST APIs, Hibernate ORM, and MySQL integration.

## 📂 Project Structure
src/main/java/com/project/
│
├── entity/
│   ├── Person.java
│   └── Aadhar.java
│
├── repository/
│   ├── PersonRepo.java
│   └── AadharRepo.java
│
├── controller/
│   ├── PersonController.java
│   └── AadharController.java
│
└── AadhaarAuthenticationSystemApplication.java


## ⚡ API Endpoints

### Aadhaar APIs
- `POST /saveAadhar` → Save Aadhaar  
- `PUT /update` → Update Aadhaar  
- `DELETE /delete/{aid}` → Delete Aadhaar by ID  
- `GET /find/{aid}` → Find Aadhaar by ID  
- `GET /fetchAll` → Fetch all Aadhaar records  
- `POST /authenticate` → Aadhaar authentication  

### Person APIs
- `POST /savePerson/{aid}` → Save Person with Aadhaar  
- `PUT /updatePerson` → Update Person  
- `DELETE /deletePerson/{pid}` → Delete Person by ID  
- `GET /findPerson/{pid}` → Find Person by ID  
- `GET /fetchAllPersons` → Fetch all Persons  

## ▶️ Run Project
1. Clone repo  
  ` git clone https://github.com/CodeMaestro-04/aadhaar-authentication-system.git`

   
2.Configure database in application.properties

`spring.datasource.url=jdbc:mysql://localhost:3306/your_db`
`spring.datasource.username=root`
`spring.datasource.password=your_password`
`spring.jpa.hibernate.ddl-auto=update`
`spring.jpa.show-sql=true`

3.Run using Maven:

`mvn spring-boot:run`


4.Test APIs in Postman 🎯

---
 

