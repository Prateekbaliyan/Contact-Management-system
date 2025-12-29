# 📇 Contact Management CRUD App (Spring Boot)

This is a simple **Spring Boot RESTful Web Application** that performs **CRUD (Create, Read, Update, Delete)** operations for managing contacts. Each contact contains a **name** and a **phone number**.

This project is suitable for **beginners**, **college practicals**, **exams**, **viva**, and **learning REST APIs using Spring Boot**.

---

## 🚀 Features

- Create a new contact  
- View all contacts  
- Update an existing contact  
- Delete a contact  
- RESTful APIs  
- Tested using Postman  
- In-memory data storage (no database)

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Maven
- REST API
- Postman
- VS Code

---

## 📂 Project Structure

contact-management
│
├── pom.xml
├── README.md
│
└── src
└── main
├── java
│ └── com.example.contact
│ ├── ContactManagementApplication.java
│ ├── controller
│ │ └── ContactController.java
│ ├── model
│ │ └── Contact.java
│ ├── repository
│ │ └── ContactRepository.java
│ └── service
│ └── ContactService.java
│
└── resources
└── application.yml

yaml
Copy code

---

## 🔗 REST API Endpoints

| HTTP Method | Endpoint | Description |
|------------|----------|-------------|
| POST | `/contacts` | Create a new contact |
| GET | `/contacts` | Get all contacts |
| PUT | `/contacts/{id}` | Update a contact |
| DELETE | `/contacts/{id}` | Delete a contact |

---

## 🧪 API Testing using Postman

### ➤ Create Contact
**POST** `http://localhost:8080/contacts`

```json
{
  "name": "Prateek",
  "phone": "9876543210"
}
➤ Get All Contacts
GET http://localhost:8080/contacts

json
Copy code
[
  {
    "id": 1,
    "name": "Prateek",
    "phone": "9876543210"
  }
]
➤ Update Contact
PUT http://localhost:8080/contacts/1

json
Copy code
{
  "name": "Prateek Baliyan",
  "phone": "9999999999"
}
➤ Delete Contact
DELETE http://localhost:8080/contacts/1

nginx
Copy code
Contact deleted successfully
▶️ How to Run the Project
Prerequisites
Java 17 or higher

Maven installed and added to PATH

VS Code

Postman

Steps to Run
Open terminal in project root folder:

Copy code
contact-management
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
Application will start on:

arduino
Copy code
http://localhost:8080
✅ Verify Application
Open browser and visit:

bash
Copy code
http://localhost:8080/contacts
Expected output:

css
Copy code
[]
📚 Concepts Covered
Spring Boot

RESTful Web Services

REST Controller

Request Mapping

Request Body

Path Variable

GET, POST, PUT, DELETE APIs

Maven Dependency Management

Postman API Testing

Building Web Applications

📝 Notes
This application uses in-memory storage, so data will be lost after restarting the server.

No database is used.

Ideal for learning, exams, practicals, and viva.

👨‍💻 Author
Prateek Baliyan

⭐ Future Enhancements
Integrate MySQL database

Use Spring Data JPA

Add validation

Add exception handling

Add Swagger UI

Add authentication and authorization
