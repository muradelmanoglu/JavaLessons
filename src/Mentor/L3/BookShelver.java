package Mentor.L3;


import java.util.Scanner;

public class BookShelver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Neçə Kitab Qoymağı Planlaşdırısınız? :");
        int say = sc.nextInt();
        for (int i = 1; i <= say; i++) {
            System.out.println("Kitab : " + i + " Rəfə qoyuldu və nömrələndi.");
        }
System.out.println("Bütün " + say + " kitab rəfə yerləşdirildi.");
    }
}
