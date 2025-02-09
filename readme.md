# 🛫 Flight Management System ✈️

## 📌 Overview

The **Flight Management System** is a **Java application** designed to streamline the management of flight information. It provides both a **Graphical User Interface (GUI)** and a **Command-Line Interface (CLI)** for users to input, manage, and view details about flights. This system facilitates tasks such as **adding new flights** and **sorting existing flights** based on their flight numbers.

## 🚀 Features

- ✍️ **Add Flight**: Users can input comprehensive flight details, including:
  - Airline Name ✈️
  - Flight Number 🔢
  - Origin & Destination 🌍
  - Airfare 💰
  - Departure & Arrival Times ⏳
  - Flight Duration ⏱️ (min(s))
  - Available Seats 💺
  - Distance 📏
- 🔄 **Sort Flights**: Existing flights can be sorted **in ascending order** based on their flight numbers for easier navigation and reference.

## 🛠️ Installation and Execution

1. **Java Development Kit (JDK)**: Ensure you have **JDK 8 or higher** installed on your system.
2. **Download Source Code**: Clone the repository to your local machine.
3. **Open the Project**: Use your preferred **Java IDE**.
4. **Run CLI Version**: Navigate to `FlightTest.java` and run it.
5. **Run GUI Version**: Navigate to `Form1.java` and run it.
6. **Use the GUI**: Input flight details and use the **Add Flight** and **Sort Flights** buttons.

## 🏗️ Components

### 1️⃣ Form1.java (GUI) 🎨
- **Graphical User Interface** built with **Swing**.
- Provides an intuitive **input form** for flight details.
- **Buttons** for adding and sorting flights.
- **Event Listeners** for smooth interactions.

### 2️⃣ Flight.java 🛬
- **Encapsulates flight data** (Airline, Flight No., Origin, Destination, etc.).
- **Getter & Setter Methods** ensure encapsulation and data integrity.
- **Overrides `toString()`** for readable flight info representation.

### 3️⃣ FlightTest.java 🖥️
- **Command-Line Interface (CLI)** implementation.
- **User input prompts** for adding flight details.
- Displays **pre-sorted and sorted flights** based on flight numbers.
- Uses the **Flight class** for flight data management.

## 📝 Usage

### 🎨 GUI (Form1.java):
- **Run the Form1.java file**.
- **Enter flight details** in the form fields.
- **Click "Add Flight"** to store the flight.
- **Click "Sort Flights"** to arrange flights by flight number.

### 🔢 CLI (FlightTest.java):
- **Run FlightTest.java**.
- **Follow on-screen instructions** to input flight details.
- **View pre-sorted and sorted flights** displayed in the console.

## 📸 Screenshots
![Before Sorting](https://github.com/user-attachments/assets/f94ff839-04a5-47ec-a18d-d7776476096e)  
![After Sorting](https://github.com/user-attachments/assets/1c7697f6-8597-4f00-8862-30f222012356)  

## 📊 UML Diagram

The following **UML diagram** illustrates the structure and relationships of classes in the **Flight Management System**.

![UML Diagram](https://github.com/user-attachments/assets/a0e870d3-da7c-42fe-8441-e9a526596587)

## 📦 Dependencies

- **Java Development Kit (JDK) 8+** ☕
- **Swing Library** (included in standard Java libraries) 🎨

## 🖥️ Development Environment

- **IDE:** IntelliJ IDEA / Eclipse / NetBeans 🛠️

## 👨‍💻 Contributors

**Aakrosh Rai** (8080055) ✍️

## 📜 License

This project is **open-source** and available under the [MIT License](https://opensource.org/licenses/MIT). ✅

## 🤝 Connect With Me
📧 **Email**: aakroshrai15@gmail.com 📩  
🔗 **LinkedIn**: [Aakrosh](https://www.linkedin.com/in/aakrosh-rai-7332b7314/) 💼  
📂 **GitHub**: [IerenoLXI](https://github.com/IerenoLXI) 🚀
