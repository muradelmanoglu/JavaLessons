import java.util.Scanner;

public class CoffeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CodaPolis CoffeeShop Sizi Salamlayır!");
        System.out.println("Xidmətlərimizdən yararlana bilmək üçün zəhmət olmazsa");
        System.out.print("Yaşınızı qeyd edin: ");
        int age = sc.nextInt();

        double telEndirim = 0;
        double teqEndirim = 0;

        if (age <= 12) {
            System.out.println("Sizin üçün içkilər ÖDƏNİŞSİZDİR! ");
            System.out.println("Xahiş olunur Seçiminizi Edin!");
        } else if (age > 12 && age <= 17) {
            System.out.println("Xüsusi 10%-lik TƏLƏBƏ Endirimi! ");
            System.out.println("Xahiş olunur Seçiminizi Edin!");
            telEndirim = 0.10;
        } else if (age > 65) {
            System.out.println("Xüsusi 10%-lik Təqaüdçü Endirimi! ");
            System.out.println("Xahiş olunur Seçiminizi Edin!");
            teqEndirim = 0.10;
        } else
            System.out.println("Xahiş olunur Seçiminizi Edin!");

        double qiymeti = 0;
        String adı = "";
        String uAdı = "";


        if (age <= 12){
            System.out.println("---- Uşaq Menyusu ----");
            System.out.println("1. Isti Şokolad - 0 Azn");
            System.out.println("2. Çay - 0 Azn");
            System.out.println("3. Meyvə Şirəsi - 0 Azn");
        } else
        {
            System.out.println("1. Espresso - 3.4 Azn");
            System.out.println("2. Ekspresso - 13.4 Azn :D");
            System.out.println("3. Americano - 5 Azn");
            System.out.println("4. Südlü Qəhvə - 10 Azn");
        }
        System.out.print("Seçiminiz: ");
        String sechim = sc.next();


        switch (sechim) {
            case "1":
        qiymeti = 3.4;
        adı = "Espresso";
        uAdı = "İsti Şokolad";
        break;
            case "2":
        qiymeti = 13.4;
        adı = "Ekspresso";
        uAdı = "Çay";
        break;
        case "3":
            qiymeti = 5;
            adı = "Americano";
            uAdı = "Meyvə Şirəsi";
            break;
            case "4":
                qiymeti = 10;
                adı = "Südlü Qəhvə";
                break;
        default:
            System.out.println("Seçim düzgün edilməmişdir!");
            return;
        }

double endQiymetiTel = qiymeti * (1 - telEndirim);
        double endQiymetiTeq = qiymeti * (1 - teqEndirim);

        if (age <= 12) {
            System.out.println("Sizin üçün içkilər ÖDƏNİŞSİZDİR! ");
        } else if (telEndirim > 0) {
            System.out.println("Xüsusi 10%-lik TƏLƏBƏ Endirimi ilə Ödənişimiz " + endQiymetiTel + " Azn-dir!");
        } else if (teqEndirim > 0) {
            System.out.println("Xüsusi 10%-lik Təqaüdçü Endirimi ilə Ödənişimiz " + endQiymetiTeq + " Azn-dir!");
        } else
            System.out.println("Sizin Ödənişimiz " + qiymeti + " Azn-dir!");
        if (age <= 12) {
            System.out.println("Səbrli Olun 10 Dəqiqə Sonra " + uAdı + " Hazırdır!");
        }else
            System.out.println("Səbrli Olun 10 Dəqiqə Sonra " + adı + " Hazırdır!");

        sc.close();

    }
}
