# Experiment 7: Shopping Cart Servlet Controller

## Aim

Design a Java Servlet controller that connects the shopping-cart web application from Experiment 1 with the database CRUD operations developed in Experiment 5. The intended application includes registration, login, product catalog, and cart pages, with data managed in an Oracle or MySQL database.

## Description

The controller is intended to receive HTTP requests from the shopping-cart web application, process user actions, and communicate with the database to create, read, update, or delete application data. In a complete application, this would connect the web interface to account, product, and cart data.

## Current implementation

`ShoppingCartController` is mapped to `/ShoppingCartController` and handles HTTP `POST` requests. It reads the `action` parameter and routes these supported values:

| Action | Current behavior |
| --- | --- |
| `register` | Returns HTTP 501 (Not Implemented); registration logic is a placeholder. |
| `login` | Returns HTTP 501 (Not Implemented); login logic is a placeholder. |
| `addToCart` | Returns HTTP 501 (Not Implemented); cart logic is a placeholder. |

A missing or blank action, or an unsupported action, returns HTTP 400 (Bad Request). The current code does not yet implement authentication, catalog or cart pages, database connectivity, or CRUD operations; those are part of the experiment's intended integration.

## Technologies

- Java 8
- Java Servlet API 4.0.1 (`javax.servlet`)
- Maven
- Oracle or MySQL as the intended database

## Build

Run from the project directory:

```sh
mvn clean package
```

The Servlet API dependency is marked `provided`, so compilation uses it but deployment requires a compatible Servlet 4.0 container.

## Note

A production implementation should add appropriate input validation, secure password handling, authorization, database error handling, and parameterized database access. A framework such as Spring MVC may also be considered as the application grows.
