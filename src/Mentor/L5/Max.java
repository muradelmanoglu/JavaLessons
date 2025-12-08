package Mentor.L5;

public class Max {
    public static void main(String[] args) {

        int [][] array = new int [2][2];
        array[0][0] = 1;
        array[0][1] = 5;

        array[1][0] = 7;
        array[1][1] = 9;


        int max = array[0][0];

for (int[] deyer : array){
    for (int deyer1 : deyer){
        if (deyer1 > max){
            max = deyer1;

        }
    }
}

        System.out.println("Ən maxsimum: " + max);

    }
}
