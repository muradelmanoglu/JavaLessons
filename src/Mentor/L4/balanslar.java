package Mentor.L4;

import java.util.Scanner;

public class balanslar {
  static void main(String[] args) {


        double[] balanslar = {1, 5, 5, 7, 6, 7, 5, 8, 1, 3};

        Scanner input = new Scanner(System.in);
        System.out.println("Axtardığınız Rəqəmə Daxil edin:" );
        double axtarilan = input.nextDouble();
        int tekrar = 0;

        for (double balans : balanslar) {
            if (balans == axtarilan) {
                tekrar++;
            }
        }
        System.out.println("Axtardığınız rəqəmin təkrar olunma sayı: " + tekrar);
    }
}
