# CMPS 360 – Java Module 1

Josh Grenninger  
CMPS 360  
Point Park University

## Project Overview

This repository contains my Java programming lab and two assignments for Module 1 of CMPS 360

All programs were created and tested using Visual Studio Code and the Java Development Kit

## Lab – HelloWorld

**File:** `Lab/HelloWorld.java`

This program is a demo for a basic Java application. It uses `System.out.println()` to display messages in the terminal.

### How to Run

From the main repository folder, enter:

```bash
cd Lab
javac HelloWorld.java
java HelloWorld
```

## Assignment 1 – Student Grade Calculator

**File:** `Assignment1/StudentGradeCalculator.java`

This program stores student information; name, major, and course. It also stores three assignment grades and calculates the average.

An `if/else` statement determines whether the student passed or failed based on an average of 70 or higher.

I included two students with different grades to demonstrate passing and failing results.

### How to Run

From the main repository folder, enter:

```bash
cd Assignment1
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

## Assignment 2 – Inventory Application and GUI

**Files:** `Assignment2/Product.java` and `Assignment2/InventoryApp.java`

This program demonstrates an inventory application for an electronics store.

The `Product` class stores product information; name, price, and quantity. It also calculates each product's inventory value by multiplying its price by its quantity.

The `InventoryApp` class creates three products: an Xbox Controller, a Controller Charging Station, and a Wireless Headset.

The application calculates the individual inventory values and the overall inventory total. Results are displayed in the terminal and a popup using Java Swing's `JOptionPane`.

### How to Run

From the main repository folder, enter:

```bash
cd Assignment2
javac Product.java InventoryApp.java
java InventoryApp
```

## Software and Tools Used

- Visual Studio Code – Writing Java code
- Java Development Kit – Compiling and running programs
- Git – Making changes to source code
- GitHub – Storing the project repository
