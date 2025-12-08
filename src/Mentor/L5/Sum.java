package Mentor.L5;

public class Sum {
    public static void main(String[] args) {

        int[][] toplanan = new int[2][3];

        for (int i = 0; i < toplanan.length; i++) {
            for (int j = 0; j < toplanan[i].length; j++) {
                System.out.println("Cəm: " + (i + j) + " " );
            }
        }
        System.out.println();
    }
}
