package com.patika.java101.maashesap;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0.0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40;
            return extraHours * 30.0;
        }
        return 0.0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double currentTax = tax();
        double currentBonus = bonus();
        double currentRaise = raiseSalary();

        double salaryWithTaxAndBonus = this.salary - currentTax + currentBonus;

        double totalSalary = this.salary + currentBonus - currentTax + currentRaise;

        return "Name : " + this.name + "\n" +
                "Salary : " + this.salary + "\n" +
                "Work Hours : " + this.workHours + "\n" +
                "Hire Year : " + this.hireYear + "\n" +
                "Tax : " + currentTax + "\n" +
                "Bonus : " + currentBonus + "\n" +
                "Salary Increase : " + currentRaise + "\n" +
                "Salary with Tax and Bonus : " + salaryWithTaxAndBonus + "\n" +
                "Total Salary : " + totalSalary;
    }
}
