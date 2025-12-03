import java.util.Scanner;

public class PhoneBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = 100;

        while (battery >= 0) {
            System.out.println("Batareya faizi " + battery + "%");
            battery -= 10;

            if (battery == 0) {
                System.out.println("Batareya faizi " + battery + "%");
                System.out.println("Telefon söndü. Zəhmət olmasa enerji yığın.");
                break;
            }

        }
    }
}