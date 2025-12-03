package Mentor.L3;

import java.util.Scanner;

public class EWallet {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xoş Gəlmisiniz!");
        System.out.print("Zəhmət olmazsa balansınızı qeyd edin:");
        double balans = sc.nextDouble();

        if (balans <= 100) {
            System.out.println("Siz Kasibsınız, Əlavə edin və 5% bonus qazanın.");
        } else if (balans > 100 && balans <= 500) {
            System.out.println("Balans stabildir. Bütün əməliyyatlar sığortalanır.");
        } else
            System.out.println("Siz VIP müştərisiniz! Bütün köçürmələr pulsuzdur.");

        System.out.println("Zəhmət Olmazsa Etmək İstədiyiniz Əməliyyatı Seçin!");
        System.out.println("1. Təcili Pul Köçürmələri");
        System.out.println("2. Balans Artırma");
        System.out.println("3. Hesab Ödənişi");
        System.out.println("4. Qızıl Alışı");
        System.out.print("Müvafiq Əməliyyat nömrəsini qeyd edin: ");
        int emeliyyat  = sc.nextInt();


switch (emeliyyat) {
    case 1:
        System.out.println("Təcili Pul Köçürmələri.");
        System.out.println("1. Ölkə Daixli.");
        System.out.println("2. Ölkə Xarici.");
        System.out.print("Seçim: ");
        int ch = sc.nextInt();
        System.out.print("Məbləği Qeyd edin: ");
        int qeyd = sc.nextInt();
        break;
        case 2:
            System.out.println("Balans Artırma: ");
            if (balans <= 100) {
                System.out.println("Balansınızı Artırdığınız üçün Əlavə 5% bonus.");
                System.out.print("Məbləği Daxil Edin: ");
        }else
            System.out.print("Məbləği Daxil Edin: ");
            int daxil = sc.nextInt();
    case 3:
        System.out.println("Hesab Ödənişləri:");
        System.out.print("Ödənişin Təyinatını Qeyd Edin: ");
        String teyinat = sc.next();
        System.out.println("Əməliyyat: " + teyinat + " ödənişi." );
        System.out.print("Ödənişin Məbləğini Qeyd Edin: ");
        int mbl = sc.nextInt();

        case 4:
            System.out.println("Qızıl Alışı:");
            System.out.println("585");
            System.out.println("750");
            System.out.println("Qızılın əyarını qeyd edin: ");
            String eyar = sc.next();
            System.out.println("Almaq istədiyiniz qram: ");
            int alam = sc.nextInt();
            System.out.println("Təbrik Edirik! Siz " + alam + " qram " + eyar + " əyar Qızıl Sifariş verdiniz!");
}

sc.close();
    }
}
