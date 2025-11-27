import java.util.Scanner;

public class OrderConfirmation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isConfirmed = false;

        do {
            System.out.println("Sifarişinizi nəzərdən keçirdir: Ümumi Məbləğ 85 Azn");
            System.out.println("Təsdiq edirsiniz? (Yes/No)");
            String cavab = sc.nextLine();

            if (cavab.equalsIgnoreCase("Yes")) {
                isConfirmed = true;
                System.out.println("✅ Sifariş Təsdiqləndi! Göndərilmə prosesinə başlandı.");
            } else if (cavab.equalsIgnoreCase("No")) {
                System.out.println("Sifariş təsdiqlənmədi. Zəhmət olmasa yenidən cəhd edin.");
            } else {
                System.out.println("Zəhmət olmasa düzgün seçim edin (Yes/No)");
            }

        } while (isConfirmed == false);

        sc.close();
    }
}