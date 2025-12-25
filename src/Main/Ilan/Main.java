package Main.Ilan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OyunMuherriki oyun = new OyunMuherriki(30, 10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Oyun Başlayır!");
        System.out.println("İdarəetmə: w (yuxarı), s (aşağı), a (sol), d (sağ)");

        while (!oyun.isgameOver()) {
            oyun.game();
            System.out.print("İdarə (w,a,s,d): ");
            char secim = sc.next().charAt(0);
            oyun.duymeniEmalEt(secim);
            oyun.yenile();
        }

        System.out.println("\n!!! OYUN BİTDİ !!!");
    }
}