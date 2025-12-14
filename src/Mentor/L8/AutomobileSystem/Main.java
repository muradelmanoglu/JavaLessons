package Mentor.L8.AutomobileSystem;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Mercedens Benz - E220", "Qara");

        System.out.println("\n------ Maşın Haqqında ------");

       myCar.fuel();
       myCar.move();

    }
}
