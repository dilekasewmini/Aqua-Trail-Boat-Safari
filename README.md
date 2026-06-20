# Aqua Trail Boat Safari Management System

A comprehensive web-based application developed to manage boat safari operations, customer bookings, staff activities, and promotional campaigns. The system provides separate portals for customers and staff members, ensuring efficient management of boat safari services.

## Features

### Customer Portal

* User registration and login
* Browse available boat safari trips
* View trip details and pricing
* Book trips online
* Track booking status
* View special offers and promotions
* Submit feedback and reviews

### Staff Portal

#### Administrator

* Manage staff accounts and roles
* Manage boats and schedules
* Configure pricing and trip availability

#### Operational Manager

* Monitor trip operations
* Review customer feedback
* Track trip performance

#### Boat Captain

* View assigned trips
* Update trip completion status
* Report operational issues

#### Booking Officer

* Manage reservations
* Process and update bookings

#### Marketing Executive

* Create promotional campaigns
* Manage offers and discounts
* View customer engagement analytics

## Technology Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* MySQL
* HTML5
* CSS3
* Maven
* Git & GitHub

## Project Structure

```text
SE_Project_Final
│
├── src
│   └── main
│       ├── java
│       │   └── org.example.se_project_final
│       │       ├── controller
│       │       ├── service
│       │       ├── repository
│       │       └── model
│       │
│       └── resources
│           ├── templates
│           ├── static
│           ├── application.properties
│           └── data.sql
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Installation

1. Clone the repository

```bash
git clone https://github.com/dilekasewmini/Aqua-Trail-Boat-Safari.git
```

2. Configure MySQL database settings in `application.properties`

3. Build the project

```bash
mvn clean install
```

4. Run the application

```bash
mvn spring-boot:run
```

5. Open your browser and navigate to:

```text
http://localhost:8080
```

## Learning Outcomes

* Full-stack web application development
* Spring Boot application architecture
* MVC design pattern implementation
* Database management with MySQL
* Role-based authentication and authorization
* Team collaboration using Git and GitHub

## Author

**Dileka Sewmini**

Software Engineering Undergraduate
