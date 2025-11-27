import java.util.Scanner;

public class ATMWH {
    public static void main(String[] args) {
        int cehtSayı = 3;
        int dogruPin = 1234;
        int ceht = 0;
        boolean pinDuzgun = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("CodaPolis Bank Sizi Salamlayır!");
        System.out.println("ATM");


        while (!pinDuzgun && ceht < cehtSayı){
            ceht++;
            System.out.print("Zəhmət olmasa PİN Daxil Edin: ");
            int pin = sc.nextInt();
            if (pin == dogruPin) {
                System.out.println("Sistemə Daxil Oldunuz.");
                break;
            } else if (ceht < cehtSayı) {
                System.out.println("YANLIŞ PİN! Qalan Cəht Sayı " + (cehtSayı - ceht));
            } else
                System.out.println("3 Yanlış Cəht! Kartınız BLOKA DÜŞDÜ. Bankınızla Əlaqə Saxlayın!");
        }
    }
}
