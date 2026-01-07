package Mentor.L11.CinemaManagementSystem;

import java.util.Scanner;

public class CinemaHallManager {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        CinemaHall myHall = new CinemaHall(3, 3);

        while (true) {

            System.out.println("Code Polis Sinema Zalına Xoş Gəlmisiniz.");
            System.out.println("Əməliyyatlar: \n1. Bron Əlavə et. \n2. Bronlara Bax. \n3. Bron Sil \n4. Ada görə bron axtarışı. \n0. Çıxış.");
            System.out.print("Seçim edin: ");
            int choose = sc.nextInt();

            try {
                switch (choose) {
                    case 1:
                        System.out.println("Bron Əlavə Et.\n");
                        System.out.println("Sıra: ");
                        int r = sc.nextInt();
                        System.out.println("Yer: ");
                        int c = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Adı: ");
                        String silentName = sc.nextLine();
                        System.out.println("Qiyməti: ");
                        double price = sc.nextDouble();
                        myHall.addBron(r, c, new Bron(silentName, price));
                        break;

                    case 2:
                        System.out.println("Bronların Listi: \n");
                        myHall.view();
                        break;

                    case 3:
                        System.out.println("Bron sil: \nSilmək istədiyiniz sıra və yeri qeyd edin: ");
                        int dr = sc.nextInt(); int dc = sc.nextInt();
                        myHall.delete(dr, dc);
                        break;

                    case 4:
                        System.out.println("Axtarış Sistemi. \nAxtardığınız adı qeyd edin: ");
                        sc.nextLine();
                        String sName = sc.nextLine();
                        myHall.findByName(sName);
                        break;

                    case 0:
                        System.out.println("Sistemdən çıxdı. Gününz uğurlu keçsin.");
                        return;

                    default:
                        System.out.println("Doğru seçim edin!");
                }
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Gözllənilməz Xəta.");
            }
        }
    }
}
