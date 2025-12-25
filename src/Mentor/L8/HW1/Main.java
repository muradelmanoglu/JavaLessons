package Mentor.L8.HW1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Murad", 30 );
        Vehicle vehicle = new Vehicle("Merceneds Benz", "Maşın");
        Device device = new Device("İphone");



        person.describe();
        person.interact();
        person.performAction();
        System.out.println("___________________________________________________");

        vehicle.describe();
        vehicle.interact();
        vehicle.performAction();
        System.out.println("___________________________________________________");

device.describe();
        device.isOn = true;
device.interact();
device.performAction();

        System.out.println("___________________________________________________");


    }
}
