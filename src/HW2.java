import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gross Əmək Haqqı: ");
        double gross =  sc.nextDouble();

        System.out.print("Vergi Faiz: ");
        double vergi = sc.nextDouble();

        double faiz = gross * vergi;
        double yekun = gross - faiz;

        System.out.println("Gross Əmək Haqqı: " + gross + "Azn");
        System.out.println("Vergi: " + faiz + "Azn");
        System.out.println("Xalis Əmək Haqqı: " + yekun + "Azn");

        sc.close();
    }
}