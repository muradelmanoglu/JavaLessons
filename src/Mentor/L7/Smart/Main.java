package Mentor.L7.Smart;

public class Main {
    public static void main(String[] args) {

        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println(" -----------------------------------------            Smart Device            -----------------------------------------");
        System.out.println("________________________________________________________________________________________________________________________");

        SmartWatch smartWatch = new SmartWatch("Apple - ", "SE: ");

        smartWatch.connectToWifi();
        smartWatch.stepCounter();

        System.out.println("________________________________________________________________________________________________________________________");

        SmartSpeaker smartSpeaker = new SmartSpeaker("JBL - ", "Clip 3: ");

        smartSpeaker.connectToWifi();
        smartSpeaker.playMusic();

        System.out.println("________________________________________________________________________________________________________________________");

        SmartFridge smartFridge = new SmartFridge("Samsung - ", "Bespoke AI 4-Door Flex™: ", 18);

        smartFridge.connectToWifi();
        smartFridge.showTemperature();

        System.out.println("________________________________________________________________________________________________________________________");

        smartWatch.disconnect();
        System.out.println("________________________________________________________________________________________________________________________");
        smartSpeaker.disconnect();
        System.out.println("________________________________________________________________________________________________________________________");
        smartFridge.disconnect();
        System.out.println("________________________________________________________________________________________________________________________");

    }
}
