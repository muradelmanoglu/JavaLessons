package Main.L5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Giris userGiris = new Giris();
        System.out.print("Xahiş edirik istifadəçi adınızı Daxil edin: ");
        String name = sc.nextLine();
        System.out.print("Xahiş edirik istifadəçi Şifrənizi Daxil edin: ");
        String password = sc.next();
        userGiris.setName(name);
        userGiris.setPassword(password);

        EWallet pulQabim = new EWallet();
        boolean davamEt = true;

        System.out.println("\n**Elektron Pulqabı Sisteminizə Xoş Gəlmisiniz, " + name + "!**");

        do {
            double cariBalans = pulQabim.getBalance();
            if (cariBalans > 0) {
                System.out.printf("\nCari Balansınız: %.2f AZN\n", cariBalans);
            }

            System.out.println("\nXahiş edirik etmək istədiyiniz əməliyyatı seçin:");
            System.out.println("1. Mədaxil (Depozit)    2. Məxaric (Çıxarış)    3. Çıxış");
            System.out.print("Seçiminiz: ");
            String choose = sc.next().toLowerCase();

            switch (choose) {
                case "1":
                    case "mədaxil":
                    System.out.print("\nXahiş edirik Mədaxil məbləğini qeyd edin: ");
                    if (sc.hasNextDouble()) {
                        double depozit = sc.nextDouble();
                        if (depozit > 0) {
                            pulQabim.setDeposit(depozit);
                            System.out.printf("%.2f AZN mədaxil edildi.\n", depozit);
                        } else {
                            System.out.println("Mədaxil məbləği müsbət olmalıdır.");
                        }
                    } else {
                        System.out.println("Yanlış məlumat. Zəhmət olmasa rəqəm daxil edin.");
                        sc.next();
                    }
                    break;

                case "2":
                    case "məxaric":
                    if (pulQabim.getBalance() <= 0) {
                        System.out.println("Balansınız sıfırdır. İlk olaraq Mədaxil (Depozit) etmək lazımdır.");
                        break;
                    }

                    System.out.print("\nXahiş edirik Məxaric məbləğini qeyd edin: ");
                    if (sc.hasNextDouble()) {
                        double mexaric = sc.nextDouble();

                        if (mexaric > 0) {
                            pulQabim.setWithdraw(mexaric);
                        } else {
                            System.out.println("Məxaric məbləği müsbət olmalıdır.");
                        }
                    } else {
                        System.out.println("Yanlış məlumat. Zəhmət olmasa rəqəm daxil edin.");
                        sc.next();
                    }
                    break;

                case "3":
                case "çıxış":
                    System.out.println("\nElektron Pulqabı Sistemindən çıxılır. Təşəkkür edirik!");
                    davamEt = false;
                    break;

                default:
                    System.out.println("Yanlış seçim. Zəhmət olmasa düzgün seçim edin!");
            }
        } while (davamEt);
        sc.close();
    }
}