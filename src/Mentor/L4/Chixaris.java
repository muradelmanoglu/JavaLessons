package Mentor.L4;

public class Chixaris {
    public static void main(String[] args) {

        int [] balanslar = {-10, 20, 5, -30, 15, 40, -5, 10};

        int say = 0;
        for (int musbet :  balanslar) {
            if (musbet > 0) {
              say++;
              System.out.println("Müsbət ədədlər: " + musbet);
            }
        }
        System.out.println("Sayı: " + say);
    }
}
