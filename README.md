# Car Racing Simulation Project

## Introduction

This Car Racing Simulation project is a Java-based application designed to demonstrate and practice Object-Oriented Programming (OOP) concepts. It simulates a basic car racing system where users can select cars with different specifications and race them against each other. This project serves as an excellent example of how OOP principles can be applied in a fun and interactive scenario and it combines my love for coding and cars. 

## Project Structure

The project is organized into three main Java classes, each representing a key component of the car racing system:

1. `Cars.java`: The base class representing basic car information.
2. `Specs.java`: An extended class of Cars, adding specific performance details.
3. `Race.java`: The main class that runs the racing simulation and user interaction.


## Object-Oriented Programming Concepts Showcase

This project demonstrates several key OOP concepts:

1. **Inheritance**: The Specs class extends the Cars class, inheriting its properties and methods.

2. **Encapsulation**: Both Cars and Specs classes use private attributes with public getters and setters.

3. **Method Overriding**: The Specs class overrides the `displayCarInfo()` method from the Cars class.

4. **Polymorphism**: The Race class uses Specs objects, which are also Cars objects due to inheritance.

5. **Object Composition**: The Race class creates and manages multiple car objects.

6. **Access Modifiers**: Proper use of private and public access modifiers to control access to class members.

7. **Constructor Chaining**: The Specs class constructor calls the superclass constructor using `super()`.


#Note

I do NOT condone any sort of car racing especially on public roads. Leave that to the track/dragstrip :)
