import java.util.Scanner;

import static java.lang.System.out;

public class Vulkan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cinsiniz = "";
        String sual = "";
        int can = 3;
        int dogru1 = 25;
        int dogru2 = 30;
        int dogru3 = 0;
        boolean tarzanKecilib = false;
        boolean tepegozKecilib = false;
        boolean qiriqKorpu = false;
        boolean yananNedir = false;
        int umumiBal = 0;
        int kecimisMerheleSayi = 0;
        int umumiMerheleSayi = 4;

        out.println("CodePolis adasına Xoş gəlmisiniz! İstirahətiniz müddətində Sizə necə müraciət edək? ");
        out.print("Adınız: ");
        String ad = sc.nextLine();
        out.print("Cinsiniz? (Kişi/Qadın): ");

        String secim = sc.nextLine().toLowerCase();
        switch (secim) {
            case "kişi":
                cinsiniz = "Bəy";
                break;
            case "qadın":
                cinsiniz = "Xanım";
                break;

            default:
                out.println("Xahiş edirik Seçim Edəsiniz!");
                return;
        }
        out.println("----------------------------------------------------------------------------------------------------------------------------");
        out.println("Hörmətli " + ad + " " + cinsiniz + " bildiyiniz kimi adamızda qədim vulkan artıq aktiv haldadır! Qarşınızda qaçmaq üçün 4 " +
                "çıxış yolu var və \nmərhələli şəkildə bu yollardan keçməyiniz üçün sadəcə 3 şans verilir. Doğru yolları izləyin və adadan xəsarət almadan qaçın.");
        out.println("----------------------------------------------------------------------------------------------------------------------------");

        while (can > 0 && kecimisMerheleSayi < umumiMerheleSayi) {
            out.println("-------- QAÇIŞ BAŞLAYIR --------");
            out.println("Qalan Can: " + can + ". Ümumi Bal: " + umumiBal);

            if (!tarzanKecilib) {
                out.println("1. Tarzanın Sualı\uD83D\uDC12");
            }
            if (!tepegozKecilib) {
                out.println("2. Təpəgözdən qaçış\uD83C\uDFC3\u200D\uFE0F");
            }

            if (!qiriqKorpu) {
                out.println("3. Qırıq Körpü\uD83C\uDFA2");
            }
            if (!yananNedir) {
                out.println("4. Yanan Nədir?\uD83D\uDEAC");
            }

            out.println("Qaçmaq üçün bir çıxış yolu seçin: ");
            String choose = sc.nextLine();

            switch (choose) {
                case "1":
                    if (tarzanKecilib) {
                        out.println("Bu mərhələni artıq keçmisiniz! Başqa yol seçin.");
                        break;
                    }
                    sual = "Tarzanın Sualın";
                    out.println("----------------------------------------------------------------------------------------------");
                    out.println("-------- Siz " + sual + " Seçdiniz. -------- \n" + ad + " " + cinsiniz + " Tarzan Sizə 3 Riyazi sual verəcək. Hər düzgün cavab üçün 10 Bal veriləcək. " +
                            "\nHər yanlış cavab Sizin canınızdan biri aparacaq!");
                    out.println("----------------------------------------------------------------------------------------------");

                    out.println("Sual 1: 10 + 15 = ?");
                    out.print("Cavab:");
                    int cavab1 = sc.nextInt();
                    if (cavab1 == dogru1) {
                        out.println("Cavabımız: Doğrudur. 10 Bal qazandınız!");
                        umumiBal += 10;
                    } else {
                        can--;
                        out.println("YANLIŞ CAVAB! Tarzan canınızı aldı. Qalan Can sayı " + can + " Can!");
                    }
                    sc.nextLine();

                    out.println("Sual 2: 25 - 10 + 15 = ?");
                    out.print("Cavab: ");
                    int cavab2 = sc.nextInt();
                    if (cavab2 == dogru2) {
                        out.println("Cavabımız: Doğrudur. 10 Bal qazandınız!");
                        umumiBal += 10;
                    } else
                        can--;
                    out.println("YANLIŞ CAVAB! Tarzan canınızı aldı. Qalan Can sayı " + can + " Can!");
                    sc.nextLine();
                    out.println("Sual 3: 25 - (10 + 15) = ?");
                    out.print("Cavab: ");
                    int cavab3 = sc.nextInt();
                    if (cavab3 == dogru3) {
                        out.println("Cavabımız: Doğrudur. 10 Bal qazandınız!");
                        umumiBal += 10;
                        out.println("Təbriklər, Bu gün Terk'ə yemək olmuyacaqsınız! Növbəti mərhələni seçin: ");
                        tarzanKecilib = true;
                        kecimisMerheleSayi++;
                        sc.nextLine();
                        break;
                    } else if (can > 0) {
                        can--;
                        out.println("YANLIŞ CAVAB! Tarzan canınızı aldı. Qalan Can sayı " + can + " Can!");
                    } else
                        can = 0;
                    out.println("3 YANLIŞ CAVAB! Tarzan Sizi Terk'ə yemək olmaq üçün özü ilə apardı!");
                    sc.nextLine();
                    break;

                case "2":
                    if (tepegozKecilib) {
                        out.println("Bu mərhələni artıq keçmisiniz! Başqa yol seçin.");
                        break;
                    }
                    sual = "Təpəgözdən qaçış \uD83C\uDFC3\u200D♂\uFE0F";
                    out.println("----------------------------------------------------------------------------------------------");
                    out.println("------ Siz " + sual + " mərhələsindəsiniz. Ayağınıza xəlbir dəyməsin, Ugurlar! ------");
                    out.println("----------------------------------------------------------------------------------------------");
                    for (int i = 1; can > 0; i++) {
                        out.println("----- Çəht Sayı:" + i + "Qalan Can: " + can + " ----- ");
                        out.println("Təpəgöz xəlbirlə su götürür: Qaçmaq üçün fürsətdir! Asta addımlar ilə: ");
                        out.println("Məqsədiniz Təpəgöz sizi görmədən 3 addım atmaqdır.");
                        out.println("Ən az 1, ən çox 3 addım atma şansınız var");
                        out.print("Addımların sayını seçin: ");

                        int addim ;
                        if (sc.hasNextInt()) {
                            addim = sc.nextInt();
                        } else {
                            out.println("Yanlış giriş. 1 Can itirdiniz.");
                            can--;
                            sc.nextLine();
                            continue;
                        }
                        sc.nextLine();

                        if (addim == 1) {
                            out.println("Təbriklər! Təpəgözə görünmədən qaçdınız! 20 Bal Qazandınız!");
                            umumiBal += 20;

                            tepegozKecilib = true;
                            kecimisMerheleSayi++;
                            break;

                        } else if (addim == 2) {
                            out.println("Ayağın Xəlbirə dəydi tez geri dön! Növbəti addımını seç: ");

                        } else {
                            out.println("Ayağınız ilişdi suya düşdünüz! 1 Can itirdiniz. Yenidən cəhd edin.");
                            can--;

                            if (can <= 0) {
                                out.println("Təəssüf, Təpəgöz sizi tutdu! Bütün canlarınız bitdi.");
                            }
                        }
                    }
                    break;
        case "3":
        if (qiriqKorpu) {
            out.println("Bu mərhələni artıq keçmisiniz! Başqa yol seçin.");
            break;
        }

        sual = "Qırıq Körpü\uD83C\uDFA2";
            out.println("----------------------------------------------------------------------------------------------");
            out.println("- - - - - - - - - - - - - -  Siz " + sual + " mərhələsinədsiniz - - - - - - - - - - - - - - ");;
        out.println("Qarşıda bir qırıq, bir təmiz körpü var! Sizin isə 3 seçim haqqınız var!");
        out.println("Sağ, Sol və Düz");
            out.println("----------------------------------------------------------------------------------------------");

        boolean duzgunSecilEdildi = false;

        while (!duzgunSecilEdildi) {
            out.println("Vaxt itirmədən seçiminizi edin!: ");
            String yon = sc.nextLine();

            if (yon.equalsIgnoreCase("Sağ")) {
                out.println("Siz Doğru Seçim etdiniz! 20 Bal Qazandınız!");
                umumiBal += 10;
                duzgunSecilEdildi = true;

            } else if (yon.equalsIgnoreCase("Sol")) {
                out.println("Yanlış seçim qırıq körpüdən keçdiniz, 10 Bal və 1 Can itirdiniz!");
                umumiBal -= 10;
                can--;
                duzgunSecilEdildi = true;

            } else {
                out.println("Yanlış seçim orda körpü yoxdur! 20 Bal və 1 Can itirdiniz!");
                out.println("Yenidən seçim edin!");
                umumiBal -= 20;
                can--;
            }
        }
        qiriqKorpu = true;
        kecimisMerheleSayi++;
        break;

        case "4":
        if (yananNedir) {
            out.println("Bu mərhələni artıq keçmisiniz! Başqa yol seçin.");
            break;
        }

        sual = "Yanan Nədir?\uD83D\uDEAC";
            out.println("----------------------------------------------------------------------------------------------");
            out.println("- - - - - - - - - - - - - - Siz " + sual + " mərhələsindəsiniz! - - - - - - - - - - - - - -");
            out.println("----------------------------------------------------------------------------------------------");
        boolean isCorrect = false;

        do {
            out.println("Artıq Vulkanla üz-üzəyik. Qarşıda 3 qapı var. Bunlardan ikisi vulkana, biri təxliyyə helikopterinə gedir!" +
                    " \nSualın cavabı düzgün olan qapını seç adadan təxliyyə olun: ");
            out.println("Sual: Sizcə Vulkanı yandırılar yoxsa özü yanır?");
            out.println("A) Özü Yanır,   B) Yandırırlar        C) Nə Sigaret!?");
            out.println("Cavab: ");
            String cavab = sc.nextLine();
            if (cavab.equalsIgnoreCase("C")) {
                isCorrect = true;
                out.println("Doğru Cavabdır! Təbrik edirik. 20 Bal Qazandınız!");
                umumiBal += 20;
            } else {
                out.println("Seçim Doğru Deyil! 1 Can itirdiniz. Yenidən cəhd edin.");
                can--;
            }
            if (can <= 0) break;
            yananNedir = true;
            kecimisMerheleSayi++;

        } while (!isCorrect);
        break;

        default:
        out.println("Yanlış mərhələ nömrəsi daxil etdiniz.");
        break;
    }
            }

            out.println("Yolun Sonuna Gəldik! Sizin: " + umumiBal + " Balınız var.");
                        if (umumiBal >= 70) {
                            out.println("Bu Bal ilə Siz VİP xidmətimizdən istifadə edərək, \nDigər Partlamaqda olan Vulkan adasına yola düşrsünüz! Xoş Əyləncələr :) ");
                        } else if (umumiBal > 40) {
                            out.println("Təbrik edirik! Sizi Kürdəmirə göndəririk! \nGüman edirik ora burdan İSTİ deyil!");
                        } else
                            out.println("Bu Balnan Sizi Heç Kürdəmirə belə göndərə bilmirik! Xoş Yanmalar :D");
                        sc.close();
        }
    }
