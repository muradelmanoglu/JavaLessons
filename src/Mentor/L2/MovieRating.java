import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salam, Xoş Gəlmisiniz!");
        System.out.print("Zəhmət olmasa filmi 1-10 aralığımda qiymətləndirərdiniz: ");
        int filmi = sc.nextInt();

        if (filmi >0 && filmi <5) {
            System.out.println("Çox pis qiymətləndirmə. Niyə belə bəyənmədiniz?");
            System.out.print("Səbəb: ");
            sc.nextLine();
            String sebeb = sc.nextLine();

        } else if (filmi >4 && filmi <8) {
            System.out.println("Orta qiymətləndirmə. Daha yaxşı filmlər tapaq!");
        } else if (filmi >7 && filmi <11) {
System.out.println("Əla seçim! Bu filmi dostlarınıza tövsiyə etdiyinizə əmin olun.");
        }else
            System.out.println("Reytinq 1 ilə 10 arasında olmalıdır. Xahiş edirəm yenidən yoxlayın.");

        System.out.println("Zəhmət olmasa Sizə Tövziyyə edə bilmək üçün aşağıda göstərilən janrlardan birini seçin: ");
        System.out.println("1. Fantastik");
        System.out.println("2. Bilim/Qurgu");
        System.out.println("3. Komediya");
        System.out.println("4. Dram");
        int choose = sc.nextInt();

        switch (choose)
            {
            case 1:
                System.out.println("Fantastik");
                System.out.println("Mumiya - 1999, İlk 1932 ci ildə çəkilmiş Mumiya filminin remeykidir." +
                        "Tarixi və Fantastikanı sevirsinizsə bu filmə baxa bilərsiniz. Bəyəndiyiniz halda davam filmlərinədə baxa bilərsiniz.  İMDb - 7,1");
                break;
                case 2:
                    System.out.println("Bilim/Qurgu");
                    System.out.println("11.22.66 - 2016 (8 epizod), Stephen Kingin eyniadlı əsəri əsasında çəkilmiş serialıdır. İMDb-8.0");
                    break;
                    case 3:
                        System.out.println("Komediya");
                        System.out.println("Məhəllə - 2003, Bakı Oğlanlar KVN Klubunun ilk dəfə səhnəçik olaraq oynadığı bu tamaşa sonrada Bəyazpərdəyə köçürülür. İMDb - 8.0 ");
                        break;
                        case 4:
                            System.out.println("Dram");
                            System.out.println("Pride & Prejudice - 2005, Jane Austinin eyniadlı əsəri əsasında çəkilmişdir. Bir neçə versiya içərisindən ən seviləni məhz 2005 - ci ildə" +
                                    " ekranlara verilən versiyasıdır. İMDb - 7.8");
                default:
                    System.out.println("Yanlış Janr!");
                    return;
            }
            sc.close();
    }
}
