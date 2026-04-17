# Payment System - SOLID Principles (Java)

## Overview

This project demonstrates a simple payment system designed using SOLID principles.

## Design Decisions

### Single Responsibility Principle (SRP)

Each payment class is responsible only for its own payment logic.

### Open/Closed Principle (OCP)

New payment methods can be added without modifying existing code.

### Dependency Inversion Principle (DIP)

High-level modules depend on abstractions (PaymentMethod interface), not concrete classes.

### Strategy Pattern
Each payment method is implemented as a separate strategy and can be selected at runtime.

## Implemented Payment Methods

* Credit Card (existing system)
* PayPal (newly added)

## How to Extend
To add a new payment method:
1. Create a class implementing `PaymentMethod`.
2. Add a new type to the `PaymentType` enum.
3. Register it in `PaymentRegistry` using a lambda:
   `PaymentRegistry.register(PaymentType.NEW, () -> new NewPayment());`
4. Use it via `PaymentProcessor`.

## Run
Compile and run `Main.java`.

---
 
 

 
