package Mentor.L11.CompanyEmployeeManagmentSystem;

public class Developer extends Employee {

    private String programingLanguage;

    public Developer (String name, String surname, double baseSalary, String lang) {
        super (name, surname, baseSalary);
        this.programingLanguage = lang;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Adı: " + getName() + " | Soyadı: " + getSurname() + " | Programlaşdırma Dili: " + programingLanguage +
        " | Maaşı: " + getBaseSalary() + " Azn");
    }
}
