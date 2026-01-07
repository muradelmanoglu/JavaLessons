package Mentor.L9.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IO.println("Parolu daxil edin: ");
        String password = sc.nextLine();

        try {
            checkPassword(password);
            IO.println("Giris Ugurlu Alindi.");
        } catch (InvalidPasswordException e) {
            IO.println(e.getMessage());
        } finally {
            sc.close();
        }

    }

    private static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Parol 6 herfden cox olmalidir!");
        }
    }
}