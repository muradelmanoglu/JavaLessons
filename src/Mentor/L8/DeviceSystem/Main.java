package Mentor.L8.DeviceSystem;

public class Main {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Apple", "17 Pro Max");

        phone.startPhone();
        phone.connectToWiFi();
        phone.charge();
        System.out.println("______________________________________________________________________");

        Laptop notebook = new Laptop("Asus", "Tuf");
        notebook.startLaptop();
        notebook.connectToWiFi();
        notebook.charge();
        System.out.println("______________________________________________________________________");

    }
}
