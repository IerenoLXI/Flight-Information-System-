# Flight Management System

## Overview

The Flight Management System is a Java application designed to streamline the management of flight information. It provides both a graphical user interface (GUI) and a command-line interface (CLI) for users to input, manage, and view details about flights. This system facilitates tasks such as adding new flights and sorting existing flights based on their flight numbers.

## Features

- Add Flight: Users can input comprehensive information about a new flight, including airline name, flight number, origin, destination, airfare, departure and arrival times,flight duration[min(s)], available seats, and distance.
- Sort Flights: Existing flights can be sorted based on their flight numbers in ascending order, allowing for easier navigation and reference.

## Installation and Execution

1. Java Development Kit (JDK): Ensure you have JDK 8 or higher installed on your system.
2. Download Source Code: Download or clone the source code to your local machine
3. Open the project in your preferred Java IDE.
4. Navigate to the `FlightTest.java` file and run it to start the CLI execution.
5. Similary navigate to the `Form1.java` file and run it to start the GUI execution.

6. Follow the prompts in the GUI to input flight details and press the add and sort button to add/sort flights.

## Components

#### 1. Form1.java

- Graphical User Interface (GUI) implementation using Swing.
- Provides intuitive input fields for flight information and buttons for adding and sorting flights.
- Utilizes event listeners to handle user interactions effectively.
- Interacts with the Flight class to create Flight objects and manage flight data.

#### 2. Flight.java

- Represents a Flight object encapsulating various attributes such as airline name, flight number, origin, destination, airfare, departure and arrival times, duration, available seats, and distance.
- Offers getter and setter methods for each attribute to ensure encapsulation and maintain data integrity.
- Overrides the toString() method to generate a descriptive string representation of the Flight object.

#### 3. FlightTest.java

- Command-Line Interface (CLI) implementation for interacting with the Flight Management System.
- Guides users through inputting flight information via a series of prompts.
- Displays both pre-sorted and sorted flight information based on flight numbers in the console.
- Employs the Flight class to manage flight data efficiently.

## Usage

#### 1. GUI (Form1.java):

- Launch the application by running the Form1.java file.
- Input detailed flight information in the designated fields.
- Click the "Add Flight" button to add the flight to the system.
- Use the "Sort Flights" button to arrange existing flights based on flight numbers.

#### 2. CLI (FlightTest.java):

- Execute the FlightTest.java file to interact with the Flight Management System via the command line.
- Follow the on-screen instructions to input flight details for each flight.
- View pre-sorted and sorted flight information displayed in the console.

## Screenshots
![image](https://github.com/user-attachments/assets/aa2e6ecd-2f10-4d59-ac48-2baa43e381b1)
### Before Sorting
![image](https://github.com/user-attachments/assets/f94ff839-04a5-47ec-a18d-d7776476096e)
### After Sorting
![image](https://github.com/user-attachments/assets/1c7697f6-8597-4f00-8862-30f222012356)




## UML Diagram

The UML diagram below represents the structure and relationships of the classes in the Flight Management System.

![image](https://github.com/user-attachments/assets/a0e870d3-da7c-42fe-8441-e9a526596587)


## Dependencies

- Java Development Kit (JDK) 8 or higher
- Swing library for GUI (included in standard Java libraries)

## Development Environment

- Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.

## Contributors

Aakrosh Rai(8080055)

## License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

## 🤝 Connect With Me
📧 Email: aakroshrai15@gmail.com  
🔗 LinkedIn: [Aakrosh](https://www.linkedin.com/in/aakrosh-rai-7332b7314/)  
📂 GitHub: [IerenoLXI](https://github.com/IerenoLXI)
