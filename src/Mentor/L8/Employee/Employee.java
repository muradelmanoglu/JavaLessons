package Mentor.L8.Employee;

public class Employee extends Person implements Workable, Trainable {


    private String position;


    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void printInfo() {
        System.out.println("--- İşçi Məlumatı ---");
        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Vəzifə: " + position);
        System.out.println("----------------------");
    }


    @Override
    public void work() {
        System.out.println(name + " hal-hazırda " + position + " vəzifəsində işləyir.");
    }


    @Override
    public void attendTraining() {
        System.out.println(name + " inkişaf üçün təlimdə iştirak edir.");
    }

    public static void main(String[] args) {


        Employee employee1 = new Employee("Murad Elmanoğlu", 30, "Java Developer");


        employee1.printInfo();


        employee1.work();


        employee1.attendTraining();

        System.out.println("------------------------------------------------------");


        Workable worker = new Employee("Nigar Həsənli", 35, "Layihə Meneceri");
        System.out.println("\n--- Polimorfik İşçi ---");
        worker.work();
    }

}

