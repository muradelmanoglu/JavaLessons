package Mentor.L8.DeviceSystem;

public class Device {

protected String brand;
protected String model;
protected boolean Wifi = false;

public Device(String brand, String model) {
    this.brand = brand;
    this.model = model;
}

public void startPhone(){
    System.out.println("Telefon işə düşdü!");
}

public void startLaptop(){
    System.out.println("Laptop işə düşdü!");
}

}
