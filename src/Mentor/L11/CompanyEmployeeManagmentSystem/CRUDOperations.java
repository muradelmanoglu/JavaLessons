package Mentor.L11.CompanyEmployeeManagmentSystem;

public interface CRUDOperations {

    void createEmployee(Employee emp)  throws EmployeeException;
    void viewEmployee() throws EmployeeException;
    void updateEmployee(int id) throws EmployeeException;
    void deleteEmployee(int id) throws EmployeeException;

}
