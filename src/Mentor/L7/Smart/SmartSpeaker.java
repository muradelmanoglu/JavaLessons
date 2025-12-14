package Mentor.L7.Smart;

public class SmartSpeaker extends SmartDevice {

    public SmartSpeaker (String brand, String model) {
       super(brand, model);
    }

    public void playMusic () {
        if  (isOnline) {
            System.out.println("Playing: Dido - Thank You");
        } else
            System.out.println("Musiqini oxuda bilmək üçün cihazınızı WiFi'a qoşun!");
    }

    @Override
    public void connectToWifi () {
        System.out.println("Connecting to WiFi");
        super.connectToWifi();
    }
}
