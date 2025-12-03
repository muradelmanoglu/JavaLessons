package Main.L4;

public class hava {
    static void main() {

        double[] temp = new  double[7];

        temp[0]=21.0;
        temp[1]=23.5;
        temp[2]=22.1;
        temp[3]=21.5;
        temp[4]=23.8;
        temp[5]=24.0;
        temp[6]=20.4;

        double tempcem = 0;
        double enIstiTemp = temp[0];

        System.out.println("Həftəlik Tempratur Məlumatları:");

        for (int i = 0; i < temp.length; i++) {
            tempcem += temp[i];
            System.out.println("Gün " + (i + 1) + ": " + temp[i]);
        }
        double temootra = tempcem / temp.length;

        System.out.printf("Həftəlik Orta temperatur: %.2f°C\n", temootra);

        for (double temps : temp) {
            if (temps > enIstiTemp) {
                enIstiTemp = temps;
            }
        }
        System.out.printf("Həftənin Ən İsti Tempraturu: %2f°C\n", enIstiTemp);
    }
}