import java.util.Scanner;

public class elaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elacılar = 0;
        int tekminlesme = 0;
        int normal = 0;

        String[] telebeAdı = {"Murad", "Günay", "Şəbnəm", "Bənövşə", "Zahidə", "Lalə", "Fidan", "Gülü"};
        String[] fənn = {"Riyaziyyat", "Fizika"};


        int[][] qiymetler = new int[8][2];
        qiymetler[0][0] = 100;
        qiymetler[0][1] = 90;
        qiymetler[1][0] = 54;
        qiymetler[1][1] = 60;
        qiymetler[2][0] = 35;
        qiymetler[2][1] = 44;
        qiymetler[3][0] = 98;
        qiymetler[3][1] = 89;
        qiymetler[4][0] = 78;
        qiymetler[4][1] = 95;
        qiymetler[5][0] = 54;
        qiymetler[5][1] = 60;
        qiymetler[6][0] = 100;
        qiymetler[6][1] = 95;
        qiymetler[7][0] = 60;
        qiymetler[7][1] = 78;


        for (int i = 0; i < qiymetler.length; i++) {
            System.out.print(telebeAdı[i] + ": ");
            if (qiymetler[i][0] >= 90 && qiymetler[i][1] >= 90) {
                elacılar++;
            } else if (qiymetler[i][0] <= 60  || qiymetler[i][1] <= 60) {
                tekminlesme++;
            }else
                normal++;
            for (int j = 0; j < qiymetler[i].length; j++) {
                System.out.print(fənn[j] + " = " +  qiymetler[i][j] + " ");
                if (j == 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("Əlaçıların Sayı: " + elacılar);
        System.out.println("Təkminləşmə: "  + tekminlesme);
        System.out.println("Normal qiyməti olan tələbə: " + normal);
    }
}
