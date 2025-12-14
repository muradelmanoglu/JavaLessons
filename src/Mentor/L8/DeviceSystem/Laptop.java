package Mentor.L8.DeviceSystem;

public class Laptop extends Device implements Chargeable, Connectable {

    public Laptop(String brand, String model) {
        super(brand, model);
        System.out.println("Laptop: " + brand + " " + model);
    }

    @Override
    public void connectToWiFi() {
        if (!Wifi) {
            System.out.println("Laptop WiFi'a bağlandı!");
        } else
            System.out.println("WiFi'a bağlandı!");
    }

    @Override
    public void charge (){
        System.out.println("Laptop 20% enerjisi var, Laptopu enerjiyə taxın!");
    }

}

