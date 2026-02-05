# 🤖 Factory Robot Hazard Analyzer

## 📌 Project Overview

The **Factory Robot Hazard Analyzer** is a console-based Java application designed to evaluate the hazard risk score of a factory robot. The system collects operational parameters, validates them using custom exceptions, and calculates a hazard score through a clean, modular, and Object-Oriented design.

This project demonstrates strong **OOPS principles**, structured exception handling, and maintainable architecture — making it ideal for learning enterprise-style Java development.

---

## 🎯 Objectives

* Analyze robot hazard risk based on operational inputs
* Implement validation using **custom exceptions**
* Apply **Object-Oriented Programming (OOPS)** concepts
* Build a **modular and extensible** application
* Demonstrate **clean code practices**

---

## ⚙️ Features

✅ Console-based interaction
✅ Hazard risk calculation
✅ Input validation
✅ Custom exception handling
✅ Modular architecture
✅ Easily extensible machinery risk mapping

---

## 🧠 Key Concepts Used

* Encapsulation
* Abstraction
* Single Responsibility Principle (SRP)
* Exception-based control flow
* Modularity
* Reusability
* Maintainability

---

## 🏗️ Project Structure

```
FactoryRobotHazardAnalyzer/
│
├── FactoryRobotHazardAnalyzer.java   // Main class (Input & Output)
├── RobotHazardAuditor.java          // Business logic & validation
└── RobotSafetyException.java        // Custom exception
```

---

## 🔄 Application Flow

1. User runs the application
2. Inputs are collected in the `main()` method
3. Business logic is delegated to `RobotHazardAuditor`
4. Validation errors are handled using `RobotSafetyException`
5. Hazard risk score is calculated and displayed cleanly

---

## 🧮 Hazard Risk Formula

```
Hazard Risk Score = (Worker Density × Machinery Risk Factor) / Arm Precision
```

### Supported Machinery States:

| Machinery State | Risk Factor |
| --------------- | ----------- |
| Worn            | 1.2         |
| Faulty          | 1.5         |
| Critical        | 2.0         |

---

## ▶️ How to Run the Project

### ✅ Prerequisites

* Java JDK 8 or higher
* Any IDE (IntelliJ, Eclipse, VS Code) OR terminal

---

### ✅ Compile the Program

```bash
javac *.java
```

### ✅ Run the Application

```bash
java FactoryRobotHazardAnalyzer
```

---

## 💻 Sample Execution

```
===== Factory Robot Hazard Analyzer =====

Enter Arm Precision: 2.5
Enter Worker Density: 10
Enter Machinery State (Worn/Faulty/Critical): Faulty

✅ Hazard Risk Score: 6.0
```

---

## ❗ Exception Handling Example

```
Enter Arm Precision: 0

❌ Safety Error: Arm precision must be greater than zero.
```

---

## 🧩 OOPS Principles Demonstrated

### ✔ Encapsulation

All business logic is contained within `RobotHazardAuditor`.

### ✔ Abstraction

Users interact only with method calls — internal processing is hidden.

### ✔ Single Responsibility Principle

Each class has one dedicated role:

| Class                      | Responsibility     |
| -------------------------- | ------------------ |
| FactoryRobotHazardAnalyzer | User interaction   |
| RobotHazardAuditor         | Hazard calculation |
| RobotSafetyException       | Error handling     |

### ✔ Extensibility

New machinery states can be added easily without modifying the application structure.

Example:

```java
case "Explosive":
    return 3.5;
```

---

## 🚀 Future Enhancements

* Replace String machinery states with **ENUM** (recommended for production)
* Add hazard level classification (LOW / MEDIUM / HIGH / CRITICAL)
* Convert into a menu-driven console app
* Integrate logging framework
* Build a REST API using Spring Boot
* Add unit testing with JUnit

---

## 🎓 Learning Outcomes

By completing this project, you will understand:

* How to design modular Java applications
* Proper exception handling strategies
* Real-world OOPS implementation
* Clean architecture fundamentals

---

## 👨‍💻 Author

**Balaji Sapkal**

---

## 📜 License

This project is created for educational and learning purposes.
