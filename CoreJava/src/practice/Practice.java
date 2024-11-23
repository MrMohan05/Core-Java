//EmployeeTester
//Employee Class:
//
//Include private variables: String name, int id, and double salary.
//Implement a default constructor and a parameterized constructor to initialize these variables.
//Create a method called calculateSalary() that returns the salary of a generic employee.
//
//Developer Class:
//
//Extend the Employee class.
//Introduce an additional private variable, double hra (House Rent Allowance).
//Implement a default constructor and a parameterized constructor to initialize the base class variables and the hra variable.
//Create a method called calculateSalary() in this class to include the HRA in the salary calculation for developers.
//
//
//
//Manager Class:
//
//Extend the Employee class.
//Introduce two additional private variables, double ta (Travel Allowance) and double foodAllowance.
//Implement a default constructor and a parameterized constructor to initialize the base class variables and the additional variables.
//Create a method called calculateSalary() int this class to include TA and food allowance in the salary calculation for managers.
//
//
//
//In the EmployeeTester class:
//
//Create instances of the Developer and Manager classes, setting values for name, ID, salary, and relevant allowances.
//Display the calculated salary for each employee using the calculateSalary() method.
//
//
//
//
//
//Vehicle Management System
//You are tasked with designing a vehicle management system to track different types of vehicles within a fleet. Each type of vehicle has specific attributes and responsibilities.
//
//Class Hierarchy:
//
//Vehicle Class (Base Class)
//
//Attributes:
//
//String brand: Represents the brand of the vehicle.
//String model: Represents the model of the vehicle.
//int year: Represents the year of manufacture.
//
//Methods:
//Constructor to initialize brand, model, and year.
//void displayInfo(): Prints the vehicle's details (brand, model, and year).
//Car Class (Derived from Vehicle)
//
//Attributes:
//int numDoors: Represents the number of doors in the car.
//
//Methods:
//Constructor to initialize brand, model, year, and numDoors.
//
//void carDetails(): Prints the number of doors and the vehicle details.
//
//ElectricCar Class (Derived from Car)
//
//Attributes:
//int batteryCapacity: Represents the battery capacity of the electric car (in kWh).
//
//Methods:
//Constructor to initialize brand, model, year, numDoors, and batteryCapacity.
//void electricCarDetails(): Prints the battery capacity and car details.
//
//Task Requirements:
//
//Define the Vehicle, Car, and ElectricCar classes based on the attributes and methods described above.
//Create a VehicleManagementSystemTester class that instantiates an ElectricCar object with sample values (e.g., brand, model, year, number of doors, and battery capacity).
//Call the methods to demonstrate the functionality of each class.
//
//
//
//
//
//
//
//
//
//
//
//
//
//Problem: Zoo Management System
//
//You are tasked with creating a Zoo Management System that can handle different types of animals. You need to implement classes that represent animals and their specific characteristics. In this system, you'll implement the concept of inheritance and method overriding to showcase the behavior of animals.
//
//Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:
//
//  Create a class named Animal:
//
//    It should have private instance variables name (String) and age (int).
//    Implement a constructor that initializes the name and age.
//    Define a method makeSound() that prints "The animal makes a generic sound."
//    Define a method displayInfo() that prints the name and age.
//
//  Create a subclass named Lion:
//    Extend the Animal class.
//
//    Add a private instance variable maneLength (int).
//    Implement a constructor that takes name, age, and maneLength as parameters and initializes the superclass constructor.
//    Define a method makeSound() method to print "The lion roars loudly."
//    Define a method displayManeLength() that prints the maneLength.
//
//  Create another subclass named Elephant:
//    Extend the Animal class.
//
//    Add a private instance variable tuskLength (float).
//    Implement a constructor that takes name, age, and tuskLength as parameters and initializes the superclass constructor.
//    Define a method the makeSound() method to print "The elephant trumpets."
//    Define a method displayTuskLength() that prints the tuskLength.
//
//  Create a class named ZooManagementSystemTester (as provided in the code):
//    In the main method, create instances of both Lion and Elephant with appropriate values.
//    Print information about the lion and the elephant, including their specific attributes and the sounds they make.
//
//Your task is to implement the required classes based on the provided problem description. 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//You are tasked with designing a system to manage teacher information and the subjects they teach. The system should include the following features:
//
//