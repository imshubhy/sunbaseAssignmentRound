# Customer Management System (Spring Boot)

## Overview
This project is a **Customer Management System** built using **Spring Boot**. It provides a complete CRUD (Create, Read, Update, Delete) functionality for managing customers. The application uses **JWT (JSON Web Token)** for securing API endpoints and ensures only authenticated admins can access and manage customer data.

---
<img width="1440" alt="Screenshot 2024-10-20 at 8 00 47 PM" src="https://github.com/user-attachments/assets/7592dd57-d15b-4707-a45e-345db2fcf4d9">
<img width="1440" alt="Screenshot 2024-10-20 at 8 01 10 PM" src="https://github.com/user-attachments/assets/9b333fb9-b51c-4bd1-8607-95303dc2966f">


## Features

### 1. **JWT Authentication**
   - Secure authentication using JWT tokens.
   - Custom login and signup for admin users.
   - Only authenticated admin users can access customer management features.

### 2. **CRUD Operations for Customers**
   - **Create** a new customer by providing details such as name, address, city, state, email, and phone.
   - **Read** customer information, either fetching all customers or searching with various filters.
   - **Update** an existing customer’s information.
   - **Delete** a customer by their unique ID.

### 3. **Sync Customer Data from Remote API**
   - Synchronize the local database with a remote customer data API.
   - Uses Bearer token authentication to access the remote API.
   - Automatically updates existing customers or adds new ones during the sync process.

### 4. **Customer Search & Filtering**
   - Search for customers by **first name**, **last name**, **city**, **phone**, or **email**.
   - Filter customers based on **city**, **state**, and **email**.
   - Case-insensitive search and filtering to ensure flexibility in querying customer data.
   - Supports **pagination** and **sorting** of customer data for better performance and user experience.

### 5. **Exception Handling**
   - Custom exception handling for various scenarios such as customer not found, failed database operations, etc.
   - Descriptive error messages ensure that users get meaningful feedback in case of errors.

---

## Technology Stack
- **Spring Boot** - Backend framework
- **MySQL** - Relational database
- **JPA/Hibernate** - ORM for database interactions
- **JWT** - Authentication
- **Spring Data JPA** - For data repository
- **Maven** - Dependency management
- **HTML/CSS/JS** - Frontend for the custom login and customer management interface

---

## How to Run

### Prerequisites
- **Java 17** or later
- **MySQL** database (Ensure the database is running and accessible)
- **Maven** (for building the project)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/https://github.com/imshubhy/sunbaseAssignmentRound/customer-management-system.git
   cd customer-management-system
