package ObjectOriented;
abstract class Employee {
    String name;
    Employee(String name) { this.name = name; }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, double salary) {
        super(name);
        this.monthlySalary = salary;
    }
    double calculateSalary() { return monthlySalary; }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name, double rate, int hours) {
        super(name);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }
    double calculateSalary() { 
    	return hourlyRate * hoursWorked; 
    }
}

public class Abstraction4 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Nikhil", 50000);
        Employee e2 = new PartTimeEmployee("Jagga", 450, 80);
        System.out.println(e1.name + " Salary: " + e1.calculateSalary());
        System.out.println(e2.name + " Salary: " + e2.calculateSalary());
    }
}

