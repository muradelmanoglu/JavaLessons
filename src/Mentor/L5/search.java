package Mentor.L5;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Axtardığınız Adı Qeyd Edin: ");
        String searchName = input.nextLine();

        String[][] searchNames = new String[2][2];
        searchNames[0][0] = "Murad";
        searchNames[0][1] = "Nurlan";
        searchNames[1][0] = "Seymur";
        searchNames[1][1] = "Kamal";

        boolean found = false;

        for (String[] wanted : searchNames) {
            for (String wanted1 : wanted) {
                if (searchName.equals(wanted1)) {
                    System.out.println("Tapdınız: " + wanted1);
                    found = true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        if (!found) {
            System.out.println("Axtardığınız şəxs Sistemimizdə yoxdur!");
        }
    }
}
