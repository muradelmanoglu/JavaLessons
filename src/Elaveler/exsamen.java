
public class exsamen {
    public  static void main(String args[]) {
        int[] telebeNetcisi = new int[10];

        telebeNetcisi[0] = 15;
        telebeNetcisi[1] = 35;
        telebeNetcisi[2] = 68;
        telebeNetcisi[3] = 87;
        telebeNetcisi[4] = 98;
        telebeNetcisi[5] = 78;
        telebeNetcisi[6] = 49;
        telebeNetcisi[7] = 51;
        telebeNetcisi[8] = 66;
        telebeNetcisi[9] = 14;

        int neticeCem = 0;
        int enNetice = telebeNetcisi[0];
        int kecenler = 0;

        System.out.println("Yekun Nəticələr: ");

        for (int i = 0; i < telebeNetcisi.length; i++) {
            neticeCem += telebeNetcisi[i];
            if (telebeNetcisi[i] > 50) {
                System.out.println("Tələbə " + (i + 1) + " : " + telebeNetcisi[i] + " Bal. Uğurlu Nəticə");
                kecenler++;
            }else
                System.out.println("Tələbə " + (i + 1) + " : " + telebeNetcisi[i] + " Bal. Uğursuz Nəticə");
        }
        int ortaNet = neticeCem / telebeNetcisi.length;
        System.out.println("Sinifin orta göstəricisi = " + ortaNet);

       for (int netice : telebeNetcisi)
           if (netice > enNetice) {
               enNetice = netice;
           }
        System.out.println("Ən Yüksək Nəticə: " +  enNetice);
        System.out.print("Uğurlu tələbələrin Sayı: " + kecenler + " Nəfər");

    }
}
