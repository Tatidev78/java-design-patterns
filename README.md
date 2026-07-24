# ☕ Java Design Patterns - Abstract Factory

A Java project demonstrating the implementation of the **Abstract Factory Design Pattern**.

This project was developed to practice **Object-Oriented Programming (OOP)** concepts, software design principles, and the creation of flexible and maintainable code structures.

---

# 🚀 Project Status

✅ Completed

---

# 🎯 About the Project

This project simulates a car manufacturing system where different factories are responsible for creating families of related objects.

Using the **Abstract Factory Pattern**, the application allows the creation of different car configurations without coupling the main code to specific implementations.

The example works with:

* Different car factories
* Engine types
* Seat/upholstery types

---

# 🏭 Design Pattern Used

## Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related objects without specifying their concrete classes.

Project structure:

```text
                 ICarroFactory
                       |
        --------------------------------
        |                              |
  LuxoFactory                  EsportivoFactory
        |                              |
        |                              |
  MotorTurbo                  MotorHibrido
  EstofadoMassagem            EstofadoConcha
```

---

# 🛠️ Technologies

* Java
* Object-Oriented Programming
* Design Patterns
* Interfaces
* Abstraction

---

# 📂 Project Structure

```text
src
└── br
    └── com
        └── tcoimb

            ICarroFactory.java
            IMotor.java
            IEstofado.java

            LuxoFactory.java
            EsportivoFactory.java

            MotorTurbo.java
            MotorHibrido.java

            EstofadoMassagem.java
            EstofadoConcha.java

            Main.java
```

---

# ▶️ How to Run

## Clone the repository

```bash
git clone https://github.com/Tatidev78/java-design-patterns.git
```

## Open the project

Import the project into your Java IDE:

* IntelliJ IDEA
* Eclipse
* VS Code with Java extensions

## Run

Execute the `Main.java` class.

---

# 💡 Concepts Practiced

Through this project, I practiced:

* Object-Oriented Programming
* Interfaces and implementations
* Abstract classes and abstraction
* Factory design patterns
* Code organization
* Software design principles

---

# 📚 Learning Objective

The main goal of this project was to understand how design patterns can improve software flexibility, maintainability, and scalability.

---

# 👩‍💻 Author

**Tatiana Coimbra**

GitHub:
https://github.com/Tatidev78

LinkedIn:
https://www.linkedin.com/in/tatiana-coimbra-dev/

---

# 📄 License

This project was developed for educational purposes.
