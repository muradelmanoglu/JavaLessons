package Mentor.L5;

public class each {
    public static void main(String[] args) {

        int [][] array = {
            {5, 12, 9},
            {23, 4, 15},
            {30, 1, 10}
        };

        for  (int[] elelent : array){
            for (int i : elelent){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
