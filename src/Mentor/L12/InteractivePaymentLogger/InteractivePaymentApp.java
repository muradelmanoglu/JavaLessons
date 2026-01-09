package Mentor.L12.InteractivePaymentLogger;

import java.util.Scanner;

public class InteractivePaymentApp {
    public static void main(String[] args) {
        PaymentLogger logger = new PaymentLogger();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1: Yeni ödəniş əlavə et");
            System.out.println("2: Statistikaları göstər");
            System.out.println("3: Çıxış");
            System.out.print("Seçiminiz: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Order Qiymətini daxil edin. (ƏDV daxil.)");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    String fullStatus = "";
                    while (true) {
                        System.out.print("Status daxil edin (S - Uğurlu, F - Uğursuz): ");
                        String input = sc.nextLine().toUpperCase();

                        if (input.equals("S")) {
                            fullStatus = "SUCCESS";
                            break;
                        } else if (input.equals("F")) {
                            fullStatus = "FAILED";
                            break;
                        } else {
                            System.out.println("Xəta: Yalnız 'S' və ya 'F' daxil edə bilərsiniz!");
                        }
                    }

                    Payment newPayment = new Payment(price, fullStatus);
                    logger.addPayment(newPayment);
                    break;

                case "2":
                    logger.showStatistics();
                    break;

                case "3":
                    System.out.println("Sistemdən çıxılır.");
                    return;

                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
            }
        }
    }
}
