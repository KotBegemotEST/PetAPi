# PetAPi
# Fullstack Pet Manager (Spring Boot + React + PostgreSQL)

A **test fullstack project** that demonstrates a simple pet management system.  
It includes a **REST API** built with **Spring Boot** (Java) and a **React** frontend (Vite) with **PostgreSQL** as the database, running in Docker.

---

## Features

- **CRUD Operations**: Create, read, update, and delete pets
- **REST API** with Spring Boot and Spring Data JPA
- **Frontend UI** built with React + Vite
- **PostgreSQL Database** running in Docker
- **CORS Configuration** for frontend-backend interaction
- Easily extendable for additional features (filters, validation, authentication)

---

## Tech Stack

**Backend:**
- Java 17+
- Spring Boot (Web, Data JPA)
- Maven
- PostgreSQL (Docker)

**Frontend:**
- React (Vite)
- Axios

**Tools:**
- Docker Compose
- pgAdmin (optional)

---

## Getting Started

### 1. Run Database with Docker

docker-compose up -d

This starts PostgreSQL on port 5433 and pgAdmin on port 5050.

2. Run Backend (Spring Boot)
  cd petapi
./mvnw spring-boot:run

Backend will run at: http://localhost:8080

3. Run Frontend (React)

cd frontend
npm install
npm run dev

Frontend will run at: http://localhost:5173

## API Endpoints

**Base URL:** `http://localhost:8080/pets`

- **GET** `/pets` — Get all pets
- **GET** `/pets/{id}` — Get pet by ID
- **POST** `/pets` — Create new pet
- **PUT** `/pets/{id}` — Update pet by ID
- **DELETE** `/pets/{id}` — Delete pet by ID
