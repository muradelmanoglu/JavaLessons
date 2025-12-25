package Main.L7;

import java.util.Scanner;

public class Main {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Canlı Valyuta Konvertoru.");

        // Bunu Yalnız Bank işçisi dəyişə bilər!
        CurrencyConverter.setCommissionRate(0.01);
        System.out.println("Hazırda Bankımızda Valyuta mübadiləsi üçün komissiya " + (CurrencyConverter.getCommissionRate() * 100) + "% təşkil edir.");

        System.out.println("Zəhmət olmasa dəyişəcəyiniz valyutanı seçin: \n1. USD to AZN \n2. EVRO to AZN.");
        int choose = input.nextInt();

        Currency currencyConverter;

        switch (choose) {
        case 1:
            currencyConverter = new Usd();
            System.out.println("USD to AZN");
            break;

            case  2:
            currencyConverter = new Evro();
            System.out.println("EVRO to AZN");
            break;

            default:
                System.out.println("Düzgün Seçim edilməyib, Yenidən seçim edin!");
                return;
        }

        System.out.print("Dəyişəcəyiniz məbləği daxil edin: ");
        double total = input.nextDouble();

        currencyConverter.convertToAzn(total);

input.close();

    }
}
