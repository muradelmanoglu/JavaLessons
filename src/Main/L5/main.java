package Main.L5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Giris userGiris = new Giris();
        System.out.print("Xahiş edirik istifadəçi adınızı Daxil edin: ");
        String Name1 = sc.nextLine();
        System.out.print("Xahiş edirik istifadəçi Şifrənizi Daxil edin: ");
        String Password1 = sc.next();
        userGiris.setName(Name1);
        userGiris.setPassword(Password1);


        EWallet pulQabim = new EWallet();

        System.out.println("Xahiş edirik etmək istədiyiniz əməliyyatı qeyd edin: \n1. Mədaxil  2. Məxaric");
        String choose = sc.next().toLowerCase();
        switch (choose) {
            case "mədaxil":
            case "1":
                System.out.println("\nXahiş edirik Depozit məbləğini qeyd edin: ");
                double depozit1 = sc.nextDouble();
                pulQabim.setDeposit(depozit1);


            case "məxaric":
            case "2":
                System.out.println("\nXahiş edirik Məxaric məbləğini qeyd edin: ");
                double mexaric = sc.nextDouble();
                pulQabim.setWithdraw(mexaric);
        }
    }
}