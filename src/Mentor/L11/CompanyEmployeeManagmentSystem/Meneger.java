package Mentor.L11.CompanyEmployeeManagmentSystem;

public class Meneger extends Employee{

    private double bonus;

    public Meneger (String name, String surname, double baseSalary, double bonus) {
        super (name, surname, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Adı: " + getName() + " | Soyadı: " + getSurname() + " | Bonus: " + bonus + " Azn " +
                " | Toplam Maaşı: " + calculateSalary() + " Azn");
    }
}

