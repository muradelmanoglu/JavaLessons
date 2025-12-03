public class maliyye {
    static void main(String[] args) {

        double[] tranzaksiya = new double[10];

        tranzaksiya[0] = 156;
        tranzaksiya[1] = 2569;
        tranzaksiya[2] = 5496;
        tranzaksiya[3] = 61894;
        tranzaksiya[4] = -548;
        tranzaksiya[5] = -484;
        tranzaksiya[6] = 705;
        tranzaksiya[7] = 8884;
        tranzaksiya[8] = -2651;
        tranzaksiya[9] = -156;

        double musbetTranzaksiyasay = 0;
        double menfiTranzaksiyasay = 0;
        double tektr = 0;

        for (int i = 0; i < tranzaksiya.length; i++) {

            if (tranzaksiya[i] > 0) {
                System.out.printf("Müsbət tranzaksiyalar: %.2f %n", tranzaksiya[i]);
                musbetTranzaksiyasay++;
            } else {
                System.out.printf("Mənfi tranzaksiyalar: %.2f %n", tranzaksiya[i]);
                menfiTranzaksiyasay++;
            }

            if (i % 2 != 0)
                tektr += tranzaksiya[i];

        }
        System.out.printf("Tək İndexli Tranzaksiyaların Cəmi: %.2f\n", tektr);
        System.out.println("Müstəb Tranzaksiyaların Sayı: " + musbetTranzaksiyasay + " Mənfi Tranzaksiyaların Sayı: " +  menfiTranzaksiyasay);

        int i = 0;
        double kesintisicem = 0;
        while (tranzaksiya[i] > 0) {
    kesintisicem += tranzaksiya[i];
    i++;
     }
        System.out.println(kesintisicem);
    }


}

