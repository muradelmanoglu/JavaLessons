package Mentor.L7.Smart;

public class SmartDevice {

    protected String brand;
    protected String model;
    protected boolean isOnline;

    public  SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOnline = false;
        System.out.println(brand + " " + model + " Qurgusu Yaradıldı.");
    }

public void connectToWifi () {
        if (!isOnline) {
            isOnline = true;
            System.out.println(brand + " " + model + " markalı telefon WiFi qoşuldu. Status: Online");
        } else
            System.out.println("Cihazınız şəbəkəyə qoşuludur. Status: Online");
}

public void disconnect () {
        if (isOnline) {
            isOnline = false;
            System.out.println(brand + " " + model + " markalı telefon WiFi'dan ayrıldı. Status: Offline");
        } else
            System.out.println("Cihazınız şəbəkədən artıq ayrılıb.. Status: Offline");

        }

}
