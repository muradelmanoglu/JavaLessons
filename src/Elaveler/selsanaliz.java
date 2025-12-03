import java.io.PrintStream;

public class selsanaliz {
    public static void main(String[] args) {

        double[] illikSatislar = new double[6];

        illikSatislar[0] = 54000.36;
        illikSatislar[1] = 45000.01;
        illikSatislar[2] = 39000.65;
        illikSatislar[3] = 24580.35;
        illikSatislar[4] = 57850.25;
        illikSatislar[5] = 15484.25;

        final double hedef = 40000;
        final double bonusFaizi = 0.05;
        double totalSatis = 0;



        for (double satis : illikSatislar)
            totalSatis += satis;
        System.out.println("Total Satis: " + totalSatis);

        for (int i  = 0; i < illikSatislar.length; i++) {
            if  (illikSatislar[i] > hedef) {
                double bonus = (illikSatislar[i] -  hedef) *  bonusFaizi;
            System.out.printf("Satıcı %d: %.2fAzn. İllik Satış Həfədinə çatdı. Bonusu: %.2f%n", (i + 1), illikSatislar[i], bonus);
            } else
                System.out.println("Satıcı " + (i + 1) + " " +  illikSatislar[i] + "Azn. İllik Satış Həfədinə çatılmadı! Bonusu: 0.00Azn");

        }
        double ilkUc = 0;
            int i = 0;
            while (i <= 2) {
                ilkUc += illikSatislar[i];
                i++;
            }
        double ortaSatıs = ilkUc / 3;
        System.out.printf("İlk 3 satıcının orta satışı %.2f%n", ortaSatıs );

        }
    }

