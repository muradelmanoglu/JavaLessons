package Mentor.L8.DeviceSystem;

public class Smartphone extends Device implements Connectable, Chargeable {

    public Smartphone(String brand, String model) {
        super(brand, model);
        System.out.println("Smartphone: " + brand + " " + model);
    }

    @Override
    public void connectToWiFi() {
        if (!Wifi) {
            System.out.println("Telefon WiFi'a bağlandı!");
        } else
            System.out.println("WiFi'a bağlandı!");
    }

    @Override
    public void charge (){
        System.out.println("Telefon 80% enerjisi var!");
    }

}
