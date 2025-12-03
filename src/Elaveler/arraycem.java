public class arraycem {
    public static void main(String[] args) {
        int [][] cem = new int[4][5];

        cem[0][0] = 1;
        cem[0][1] = 2;
        cem[0][2] = 3;
        cem[0][3] = 4;
        cem[0][4] = 17;
        cem[1][0] = 5;
        cem[1][1] = 6;
        cem[1][2] = 7;
        cem[1][3] = 8;
        cem[1][4] = 18;
        cem[2][0] = 9;
        cem[2][1] = 10;
        cem[2][2] = 11;
        cem[2][3] = 12;
        cem[2][4] = 19;
        cem[3][0] = 13;
        cem[3][1] = 14;
        cem[3][2] = 15;
        cem[3][3] = 16;
        cem[3][4] = 20;


        for (int i=0; i< cem.length; i++) {
            System.out.println(i + ". " + cem[i][0] + " " + cem[i][1] +  " " + cem[i][2] + " " + cem[i][3] +  " " + cem[i][4]);
        }
    }
}
