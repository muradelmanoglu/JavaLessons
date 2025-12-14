package Mentor.L7.Smart;

public class SmartFridge extends SmartDevice {

    private double coolingLavel;

    public SmartFridge (String brand, String model, double coolingLavel) {
        super (brand, model);
        this.coolingLavel = coolingLavel;
    }

    public void showTemperature () {
        System.out.println(brand + model + " cihazından məlumat: " + coolingLavel + " (Çox Sərin!)");
    }

    @Override
    public void connectToWifi () {
        System.out.println("Connecting to WiFi");
        super.connectToWifi();
    }

    @Override
    public void disconnect () {
        super.disconnect();
        System.out.println("Soyuducunuz şəbəkədən ayrıldı. Təcili olaraq soyuducunuzu şəbəkəyə bağlayın.");
    }

}
