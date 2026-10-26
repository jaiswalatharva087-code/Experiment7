# Java Servlet Shopping Cart Controller

A lightweight Java Servlet controller for an e-commerce shopping cart application. Built using Java 8 and the Java Servlet API, it handles user registration, login, and shopping cart requests.

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Architecture & Routing](#️-architecture--routing)
- [API Specification](#-api-specification)
- [Prerequisites](#️-prerequisites)
- [Project Structure](#-project-structure)
- [Build & Run](#️-build--run)
- [Future Enhancements](#-future-enhancements)
- [License](#-license)

## ℹ️ Overview

`ShoppingCartController` is an HTTP POST controller mapped to the `/ShoppingCartController` endpoint.

It checks the incoming `action` parameter and routes requests to the appropriate handler method.

Currently supported actions:

- `register` – User registration
- `login` – User authentication
- `addToCart` – Shopping cart management

The controller currently validates actions and returns **HTTP 501 (Not Implemented)** for valid actions because the business logic and database integration are not yet implemented.

## ✨ Features

- Java Servlet-based request handling
- HTTP POST request processing
- Action-based request routing
- Validation of missing or unsupported actions
- Standard HTTP error status codes
- Foundation for future JDBC database integration

## 🏗️ Architecture & Routing

The controller follows a simple action-based request flow:

```text
HTTP POST Request
        |
        v
/ShoppingCartController
        |
        v
Check "action" Parameter
        |
        +----------------------+
        |          |           |
        v          v           v
    register     login      addToCart
        |          |           |
        v          v           v
  Registration  Login      Cart Handler
    Handler     Handler      Handler
        |          |           |
        +----------+-----------+
                   |
                   v
        HTTP 501 Not Implemented
```

If the `action` parameter is missing, blank, or unsupported, the controller returns **HTTP 400 (Bad Request)**.

## 📡 API Specification

### Endpoint

```http
POST /ShoppingCartController
```

**Content-Type:** `application/x-www-form-urlencoded`

### Request Parameters

| Parameter | Type | Required | Description |
|---|---|---|---|
| `action` | String | Yes | Specifies the action: `register`, `login`, or `addToCart`. |

### Supported Actions

| Action | Handler Method | Current Status |
|---|---|---|
| `register` | `handleRegistration()` | Not Implemented |
| `login` | `handleLogin()` | Not Implemented |
| `addToCart` | `handleAddToCart()` | Not Implemented |

### Response Codes

| HTTP Status | Description | Cause |
|---|---|---|
| `400
