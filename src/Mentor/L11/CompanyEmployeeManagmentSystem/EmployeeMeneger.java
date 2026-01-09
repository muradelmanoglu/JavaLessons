package Mentor.L11.CompanyEmployeeManagmentSystem;

import Mentor.L11.HotelRoomManagmentSystem.HotelCustomException;

import java.util.Scanner;

public class EmployeeMeneger implements CRUDOperations {

    private Employee[] employees;
    private int counts;
    Scanner sc = new Scanner(System.in);


    public EmployeeMeneger(int counts) {
        this.employees = new Employee[counts];
        this.counts = 0;
    }

    @Override
    public void createEmployee(Employee emp) {
        if (counts < employees.length) {
            employees[counts] = emp;
            counts++;
            System.out.println("İşci Uğurla yaradıldı.");
        } else {
            System.out.println("Xəta: Sistem tutumu dolub!");
        }
    }

    @Override
    public void viewEmployee() throws EmployeeException {
        if (counts == 0) throw new EmployeeException("Sistem Boşdur");

        for (int i = 0; i < counts; i++) {
            employees[i].displayInfo();
        }
    }

    @Override
    public void updateEmployee(int id) throws EmployeeException {
        int index = findIndexById(id);
        System.out.println("Yeni ad daxil edin: ");
        String newName = sc.nextLine();
        System.out.println("Yeni soyad daxil eidn: ");
        String newSurname = sc.nextLine();

        employees[index].setName(newName);
        employees[index].setSurname(newSurname);
        System.out.println("Məlumatlar yeniləndi.");
    }


    @Override
    public void deleteEmployee(int id) throws EmployeeException {
        int index = findIndexById(id);

        for (int i = index; i < counts - 1; i++) {
            employees[i] = employees[i - 1];
        }

        employees[counts - 1] = null;
        counts--;
        System.out.println("ID işçi silindi.");
    }

    private int findIndexById(int id) throws EmployeeException {
        for (int i = 0; i < counts; i++) {
            if (employees[i].getId() == id) {
                return i;
            }
        } throw new EmployeeException("Xəta: " + id + " ID-li işçi tapılmadı!");
    }
}


