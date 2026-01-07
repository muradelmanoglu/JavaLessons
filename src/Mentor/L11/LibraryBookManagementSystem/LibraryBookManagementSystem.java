package Mentor.L11.LibraryBookManagementSystem;

import java.util.Scanner;

public class LibraryBookManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library myLibrary = new Library(3, 3);
        while (true){

            IO.println("Code Polis Kitabxana Sisteminə xoş gəlmisiniz.");
            IO.println("Əməliyyatlar: \n1. Kitab Əlavə et. \n2. Kitablara Bax. \n3. Kitabı yenilə. \n4. Kitab sil. \n5. Ada görə Kitab axtarışı. \n0. Çıxış.");
            IO.print("Seçim edin: ");
            String choose = sc.nextLine();

            try {
                switch (choose) {
                    case "1":
                        IO.println("Sıra: ");
                        int r = sc.nextInt();
                        IO.println("Sütun: ");
                        int c = sc.nextInt();
                        sc.nextLine();
                        IO.println("Adı: ");
                        String name = sc.nextLine();
                        IO.println("Müəllifi: ");
                        String author = sc.nextLine();
                        IO.println("İli: ");
                        int year = sc.nextInt();
                        IO.println("Qiyməti: ");
                        double price = sc.nextDouble();
                        myLibrary.addBooks(r, c, new Books(name, author, year, price));
                        break;

                    case "2":
                        myLibrary.viewBook();
                        break;

                    case "3":
                        IO.print("Yenilənəcək Sətir və Sütunu qeyd edin: ");
                        int ur = sc.nextInt(); int uc = sc.nextInt();
                        IO.println("Yeni Qiymət: ");
                        double uPrice = sc.nextDouble();
                        myLibrary.updateBook(ur, uc, uPrice);
                        break;

                    case "4":
                        IO.println("Silinəcək Sıra ilə Sütün");
                        int dr = sc.nextInt(); int dc = sc.nextInt();
                        myLibrary.delete(dr, dc);
                        break;

                    case "5":
                        IO.print("Axtardığınız Kitabın adını yazın: ");
                        String sName = sc.nextLine();
                        myLibrary.findBook(sName);
                        break;

                    case "0":
                        IO.println("Sistemdən çıxdı. Gününz uğurlu keçsin.");
                        return;

                    default:
                        IO.println("Doğru seçim edin.");
                }

            } catch (LibraryExcaption e) {
                IO.println(e.getMessage());
            } catch (Exception e) {
                IO.println("Gözlənilməz xəta baş verdi.");
            }

        }

    }
}
