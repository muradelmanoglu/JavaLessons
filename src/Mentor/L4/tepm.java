package Mentor.L4;

public class tepm {
    public static void main(String[] args) {

        double [] temp = new double[7];
        double max = temp[0];

        temp[0]=21.5;
        temp[1]=22.0;
        temp[2]=36.5;
        temp[3]=-5.0;
        temp[4]=45.3;
        temp[5]=12.0;
        temp[6]=26.4;


        for (double x : temp) {
           if (x > max) {
               max = x;
           }
        }
        System.out.println(max);
    }
}
