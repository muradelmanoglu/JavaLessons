import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double bazaQiymeti = 0;
        String seherAdi = "";

        System.out.println("Çatdırılma Bölgəsini Seçin");
        System.out.println("Bakı");
        System.out.println("Xırdalan");
        System.out.println("Sumqayıt");
        System.out.print("Seçiminiz : ");

        String seherSecimi = Scanner.next().toLowerCase();
        switch (seherSecimi) {
            case "bakı":
                seherAdi = "Bakı";
                bazaQiymeti = 5.0;
                break;

            case "xırdalan":
                seherAdi = "Xırdalan";
                bazaQiymeti = 6.0;
                break;

            case "sumqayıt":
                seherAdi = "Sumqayıt";
                bazaQiymeti = 7.0;
                break;

            default:
                System.out.println("Çatdırlma bölgəsi deyil!");
                return;
        }

        System.out.print("Mehsulun alış qiymətini qeyd edin: ");
        double qiymeti = Scanner.nextDouble();

        double yekun = bazaQiymeti;
        String mesaj = "Ödənişli Çatdırılma!";
        if (qiymeti >= 50.0) {
            yekun = 0.0;
            mesaj = "Ödənişsiz Çatdırılma!";
        }

        double yeekun = qiymeti + yekun;
        System.out.println("---------- Yekun Hesablama ---------- ");
        System.out.println("Bölgə: " + seherAdi);
        System.out.println("Məhsulun alış qiyməti: " + qiymeti +" Azn");
        System.out.println("Status: " + mesaj);
        System.out.println("Çatdırılma Xərci: " + yekun + " Azn");
        System.out.println("Yekun Hesablama: " + yeekun + " Azn");

        Scanner.close();

    }
}