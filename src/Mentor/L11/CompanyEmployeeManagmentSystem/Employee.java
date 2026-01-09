package Mentor.L11.CompanyEmployeeManagmentSystem;

abstract class Employee {

private static int idCounter = 1;
private int id;
private String name;
private String surname;
private double baseSalary;

    public Employee(String name, String surname, double baseSalary) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
    }

    public static int getIdCounter() { return idCounter;}
    public static void setIdCounter(int idCounter) { Employee.idCounter = idCounter; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }


    public abstract double calculateSalary();
    public abstract void displayInfo();

}
