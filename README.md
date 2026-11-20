# Expense Tracker — Java Full Stack

A browser-based expense tracker built with React, Spring Boot REST APIs and MySQL.

## Features
- Create, list, edit and delete expenses
- Filter by Food, Travel, Shopping, Bills, Other
- Total spending recalculated for the selected filter
- Form validation for required values and positive amounts
- Persistent MySQL storage

## Requirements
- Java 17+
- Maven 3.9+
- MySQL 8+
- Node.js 18+

## Database setup
1. Open MySQL Workbench or MySQL command line.
2. Run: `CREATE DATABASE expense_tracker;`
3. In `backend/src/main/resources/application.properties`, replace `YOUR_MYSQL_PASSWORD` with your MySQL root password.


## Run backend
Open terminal in `backend` and run:
```bash
mvn spring-boot:run
```
Backend: `http://localhost:8080`

## Run frontend
Open another terminal in `frontend` and run:
```bash
npm install
npm run dev
```
Frontend: `http://localhost:5173`

## REST endpoints
- `GET /api/expenses` (optional `?category=Food`)
- `POST /api/expenses`
- `PUT /api/expenses/{id}`
- `DELETE /api/expenses/{id}`

Example JSON:
```json
{"title":"Lunch","amount":150,"category":"Food","date":"2026-11-12"}
```
