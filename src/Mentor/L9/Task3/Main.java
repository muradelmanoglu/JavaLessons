package Mentor.L9.Task3;


public class Main {
    public static void main(String[] args) {

        String text = null;
        int a = 1;
        int b = 0;

//        String text = "Murad";
//        int a = 1;
//        int b = 1;

        try {
            IO.println("Metinin olcusu hesablanir!");
            IO.println("Uzunluq: " + text.length());
        } catch (NullPointerException e) {
            IO.println("Xeta!");
        }

        try {
            IO.println("Bolme emeliyyati yerine yetirilir!");
            int c = a / b;
            IO.println("CAVAB: " + c);
        } catch (ArithmeticException e) {
            IO.println("Xeta!");
        }


    }
}
