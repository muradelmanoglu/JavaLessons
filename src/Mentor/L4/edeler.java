package Mentor.L4;

import java.util.Scanner;

public class edeler {
    public static void main(String[] args) {

        int [] edelers = new int[5];

        edelers[0] = 1;
        edelers[1] = 2;
        edelers[2] = 3;
        edelers[3] = 4;
        edelers[4] = 5;

        int orta = 0;
        int sum = 0;
        for(int i = 0; i < edelers.length; i++){
            sum += edelers[i];
        }

        orta = sum/edelers.length;
        System.out.println(sum);
        System.out.println(orta);
    }
}
