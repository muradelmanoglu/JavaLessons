package Mentor.L9.IntegertoEvenChecker;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Tam bir eded daxil edin: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            if (number % 2 == 0) {
                System.out.println("Even");
            } else  {
                System.out.println("Odd");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
        } finally {
            sc.close();
        }
    }
}
