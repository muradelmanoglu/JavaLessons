import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class NationalPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Milli Park Gəzintisinə Xoş Gəlmişsiniz!: ");
        System.out.println("1 - Hiking");
        System.out.println("2 - Camping");
        System.out.println("3 - Biking");
        System.out.print("Xahiş edirəm üzvlük nömrənizi qeyd edin: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Heç bir endirim yoxdur.");
        } else if (n == 2) {
            System.out.println("Çadır ləvazimatlarına 15% endirim.");
        } else if (n == 3) {
            System.out.println("Velosiped icarəsinə 25% endirim.");
        } else
            System.out.println("Yanlış Giriş");


System.out.println("----- Marşurutu Seçin -----" );
        System.out.println("1 - Biking");
        System.out.println("2 - Hiking");
        System.out.println("3 - Safari");
        System.out.println("4 - Dalış");
        System.out.print("Seçiminizi edin: ");
        int choose = sc.nextInt();

switch (choose) {
    case 1:
        System.out.println("Biking, " + "Asan," + "Saat - 15:00");
        break;
        case 2:
            System.out.println("Hiking, " + "Orta, " + "Saat - 16:00");
            break;
            case 3:
                System.out.println("Safari, " + "Asan, " + "Saat - 17:00");
                break;
                case 4:
                    System.out.println("Dalış, " + "Çətin, " + "Saat - 18:00");
                    break;
                    default:
                        System.out.println("Seşin Düzgün Edilməmişdir!");
}

sc.close();

    }


}

