[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Multi-Threaded Railway Reservation System
---

## Problem Statement (max 150 words)
The reservation systems of the railway need to efficiently book the seats while processing various booking requests from different users. In case various users want to book the seats at the same time, the improper management of the shared resources might lead to potential problems. To understand the management of the real-world systems in such cases, it is necessary to have knowledge of both object-oriented design and concurrent programming. The main idea of the project is to show the application of the fundamental concepts of Object-Oriented Programming and multithreading to simulate a simple railway reservation system. In the proposed system, the concepts of Object-Oriented Programming, such as encapsulation, abstraction, inheritance, and polymorphism, can be applied by defining the structured classes of the entities such as the users, tickets, and reservation operations. In the proposed system, the concept of multithreading can be applied to simulate the various booking requests occurring simultaneously.
---

## Target User
Small railway booking offices or ticket reservation counters that require a basic system to manage passenger bookings, seat allocation, and cancellation efficiently and Students who are studying Object Oriented Programming in Java.
---

## Core Features
•	Passenger registration with basic details
•	Seat booking for available seats
•	Seat cancellation functionality
•	Display of available and booked seats
•	Concurrent booking simulation using threads
•	Prevention of double booking using synchronization
•	Storage of booking records using file handling
•	Basic ticket generation for successful bookings

---

## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling:
- Collections / Threads:

---

## Proposed Architecture Description
The system will have five main classes, which will interact with each other for the efficient booking of seats for the passengers. The Passenger class will hold the details of the passengers, such as the passenger's name and passenger ID, entered by the user. The Ticket class will represent the confirmed booking, including the ticket ID, the selected seat number, and the passenger's details. The ReservationSystem class will be the main class responsible for handling the booking, cancellation, and availability of seats. It will use Java Collections, such as ArrayList or HashMap, for the efficient management of the list of seats. It will also ensure the booking of seats in a thread-safe manner using synchronized methods. The BookingThread class will simulate the scenario where several passengers try to book seats concurrently, where the booking will be done in separate threads using the ReservationSystem class. The FileHandler class will be responsible for handling file operations, such as saving the booking records for persistence. The main program or GUI will be responsible for accepting the passenger's details and the seats to be booked, followed by the booking request through the ReservationSystem class.
---

## How to Run

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
