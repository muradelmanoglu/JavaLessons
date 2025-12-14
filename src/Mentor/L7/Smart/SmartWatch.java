package Mentor.L7.Smart;

public class SmartWatch extends SmartDevice {

    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    public void stepCounter() {
        if (isOnline) {
            System.out.println("Addımlarınız Sayılır!");
        } else  {
            System.out.println("Addımlarınızı saymaq üçün cihazınızı WiFi'a qoşun!");
        }
    }

    @Override
    public void connectToWifi () {
        System.out.println("Connecting to WiFi");
        super.connectToWifi();
    }
}
