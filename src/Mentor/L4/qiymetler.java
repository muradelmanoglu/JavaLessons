package Mentor.L4;

public class qiymetler {
    public static void main(String[] args) {

        int[] qiymetler = {5, 4, 3, 2, 1, 0};

        int yeni = 0;
        for (int i = 0; i < qiymetler.length; i++) {
            System.out.println("İndex: " + i + ": " + qiymetler[i]);
            yeni = qiymetler[i] + 5;
            System.out.println("İndex: " + i + ": Yenilənmiş: " + yeni);
            System.out.println("------------------------------------------");
        }

    }
}