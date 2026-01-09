package Mentor.L11.CompanyEmployeeManagmentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeMeneger meneger = new EmployeeMeneger(10);
        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println("\n--- ŞİRKƏT İDARƏETMƏ SİSTEMİ ---");
            System.out.println("1. İşçi əlavə et (Developer/Manager)");
            System.out.println("2. Bütün işçiləri göstər");
            System.out.println("3. İşçi məlumatını yenilə");
            System.out.println("4. İşçini sil");
            System.out.println("5. Çıxış");
            System.out.print("Seçiminiz: ");

            try {
                int choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("İşçi Tipi. (1. Developer, 2. Meneger)");
                        int type = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Adı: ");
                        String name = sc.nextLine();
                        System.out.println("Soyadı: ");
                        String surname = sc.nextLine();
                        System.out.println("Maaş: ");
                        double baseSalary = sc.nextDouble();
                        sc.nextLine();

                        if (type == 1) {
                            System.out.println("Programlaşdırma Dili: ");
                            String lang = sc.nextLine();
                            meneger.createEmployee(new Developer(name, surname, baseSalary, lang));

                        } else if (type == 2) {
                            System.out.println("Bonus: ");
                            double bonus = sc.nextDouble();
                            sc.nextLine();
                            meneger.createEmployee(new Meneger(name, surname, baseSalary, bonus));
                        }else {
                            throw new EmployeeException("Yanlış işçi tipi seçildi!");
                        }
                        break;

                    case 2:
                        meneger.viewEmployee();
                        break;

                    case 3:
                        System.out.println("İşçi məlumatlarının yenilənməsi.");
                        System.out.println("Yenilənəcək ID'ni daixl edin." );
                        int updateId = sc.nextInt();
                        meneger.updateEmployee(updateId);
                        break;

                    case 4:
                        System.out.println("İşçinin sistemdən silinməsi.");
                        System.out.println("Silinəcək işçinin ID'ni daxil edin: ");
                        int deleteId = sc.nextInt();
                        meneger.deleteEmployee(deleteId);
                        break;

                    case 5:
                        System.out.println("Sistemdən çıxılır.");
                        return;

                    default:
                        System.out.println("Düzgün parametir seçin.");
                }
            } catch (EmployeeException e) {
                System.err.println("Xəta!" + e.getMessage());
            } catch (Exception e) {
                System.err.println("Gözlənilməz Xəta!");
                sc.nextLine();
            }
        }
    }
}
