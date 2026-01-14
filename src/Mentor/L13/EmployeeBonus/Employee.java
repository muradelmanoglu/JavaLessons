package Mentor.L13.EmployeeBonus;

import Mentor.L11.CompanyEmployeeManagmentSystem.Meneger;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(double salary) {
        super(salary);
    }
}

class Engineer extends Employee {
    public Engineer(double salary) {
        super(salary);
    }
}

class Intern extends Employee {
    public Intern(double salary) {
        super(salary);
    }
}

class BonusCalculator {

    public static double calculateBonus(List<? extends Employee> employees) {
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary() * 0.1;
        }
        return total;
    }
}

class Main {
    static void main(String[] args) {
        Manager manager = new Manager(450.9);
        Engineer engineer = new Engineer(1000);
        Intern intern = new Intern(3.50);

        List<Employee> employees = new ArrayList<>();

        employees.add(manager);
        employees.add(engineer);
        employees.add(intern);

        double totalBonus = BonusCalculator.calculateBonus(employees);

        System.out.println("Ümumi Bonus: " + totalBonus);
    }
}
