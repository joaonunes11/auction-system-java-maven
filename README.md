# Auction System – Java Maven Project

This project is a layered Java application for managing online auctions. It was developed for the course **Análise e Desenho de Software (ADS)** at Universidade de Lisboa, and follows object-oriented design principles and software architecture patterns.

## 🧩 Project Scope

The goal is to simulate the main operations of an online auction platform, including:

- Creating auctions
- Managing and publishing auctions
- Placing bids on open auctions
- Notifying participants of auction outcomes
- Managing reputations after sale

## 💡 Architecture Overview

This system is structured in layers:

- `business/` – Domain model (Leilão, Licitação)
- `use_cases/` – Application logic (Handlers)
- `client/` – Main program for testing
- `test/` – JUnit 4 unit tests for business logic

## ⚙️ Technologies Used

- Java 11+
- Maven
- JUnit 4
- Eclipse IDE (project structure)

## 🧪 Tests

Unit tests are included for core domain logic under:
src/test/java/business/LeilaoTest.java

## 📄 Project Report

The full analysis, design models (UML), use case descriptions, and implementation decisions are documented in:

ads_grupo_31.pdf

## 🚧 Limitations

- This system uses in-memory data (no persistence/database).
- Simple console-based interface for demonstration purposes.

## 👩‍💻 Authors

- João Nunes
- Tomás Páscoa
- Luís Tomé
- João Viana

## 📃 License

This project is for academic and demonstration purposes only.
