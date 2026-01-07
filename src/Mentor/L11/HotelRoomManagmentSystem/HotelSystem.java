package Mentor.L11.HotelRoomManagmentSystem;

import java.util.Scanner;

public class HotelSystem {
    static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel myHotel = new Hotel(2,5);

        while (true) {

            System.out.println("XOŞGƏLMİSİNİZ HOTEL SYSTEM");
            System.out.println("Etmək istədiyiniz əməliyyatı seçin. " +
                    "\n1. Otaq əlavə et." +
                    "\n2. Otaqlara bax." +
                    "\n3. Dəyişiklik et." +
                    "\n4. Otaq Sil." +
                    "\n5. Axtarış Sistemi." +
                    "\n0. Çıxış");

            System.out.print("Seçiminiz: ");
            int choose = sc.nextInt();

            try  {

                switch (choose) {
                    case 1:
                        System.out.println("Otaq Əlavə et.");
                        System.out.println("Lazımlı məlumatları daxil edin.");
                        System.out.println("Mərtəbə: "); int r = sc.nextInt();
                        System.out.println("Otaq; "); int c = sc.nextInt();
                        System.out.println("Otaq nömrəsi: "); int roomNumber = sc.nextInt();
                        System.out.println("Kapasite: "); int capacity = sc.nextInt();
                        System.out.println("Bir Gecəlik Qiyməti: "); double priceOneDay = sc.nextDouble();
                        myHotel.addRoom(r, c, new Room(roomNumber, capacity, priceOneDay));
                        break;

                    case 2:
                        System.out.println("Otaqlara baxış sistemi");
                        myHotel.view();
                        break;

                    case 3:
                        System.out.println("Qiymət dəyişikliyi et: ");
                        System.out.println("Mərtəbəni seç: "); int ur = sc.nextInt();
                        System.out.println("Otağı seç: "); int uc = sc.nextInt();
                        System.out.println("Yeni Qiyməti seç: ");
                        double newPrice = sc.nextDouble();
                        myHotel.update(ur, uc, newPrice);
                        break;

                    case 4:
                        System.out.println("Otağı Sil: ");
                        System.out.println("Mərtəbəni seç: "); int dr = sc.nextInt();
                        System.out.println("Otağı seç: "); int dc = sc.nextInt();
                        myHotel.delete(dr, dc);
                        break;

                    case 5:
                        System.out.println("Axtarış Sistemi: " +
                                "\n1. Kapasiteye görə." +
                                "\n2. Qiymətə görə." +
                                "\n3. Boş otaqlar.");
                        int choose1 = sc.nextInt();

                        switch (choose1) {
                            case 1:
                                System.out.println("Axtarış Sistemi: " +
                                        "\n1. Kapasiteye görə.");
                                System.out.println("Necə nəfərlik otaq axtarırısınız: ");
                                int fCapacity = sc.nextInt();
                                myHotel.findByCapacity(fCapacity);
                                break;

                            case 2:
                                System.out.println("Axtarış Sistemi: " +
                                        "\n2. Qiymətə görə.");
                                System.out.println("Maxsimum qiymət: ");
                                double maxPrice = sc.nextInt();
                                myHotel.findByMaxPrice(maxPrice);
                                break;

                            case 3:
                                System.out.println("Axtarış Sistemi: " +
                                        "\n3. Boş otaqlar.");
                                myHotel.findByAvailability(true);
                                break;

                            default:
                                System.out.println("Düzgün Seçim edin.");
                                return;
                        }

                    case 0:
                        System.out.println("Sistemdən çıxılır. Uğurlu günlər!");
                        return;

                    default:
                        System.out.println("Düzgün Seçim edin.");
                        return;
                }
            } catch (HotelCustomException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Gözlənilməz Xəta!");
            }
        }
    }
}
