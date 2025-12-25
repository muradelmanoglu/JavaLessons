package Main.L6;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Adınızı və Soyadınızı qeyd edin: ");
            String name = sc.nextLine();

            user istifadeci = new user(name);

            NotificationService emailService = new eMailService();
            NotificationService smsService = new smsService();

            String commonMessage = "Sifarişiniz təsdiqlənmişdir. Təşəkkürlər!";


            System.out.println("Göndəriş metodunu seçin: ");
            System.out.println("1. eMail      2. SMS");
            String choose = sc.nextLine().toLowerCase();

            switch (choose) {
                case "1":
                    case "email":
                System.out.println("eMail ilə göndəriş.");
                        istifadeci.sendNotification(emailService, commonMessage);
                break;

                case "2":
                    case "sms":
                System.out.println("\nSMS ilə göndəriş.");
                        istifadeci.sendNotification(smsService, commonMessage);
                break;

                default:
                    System.out.println("Düzgün Seçim edim!");
                    break;
            }
                  sc.close();
        }
    }

