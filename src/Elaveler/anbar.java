public class anbar {
    public static void main(String[] args) {

        int[] mehsul = new int[10];

        mehsul[0] = 15;
        mehsul[1] = 33;
        mehsul[2] = 35;
        mehsul[3] = 45;
        mehsul[4] = 50;
        mehsul[5] = 20;
        mehsul[6] = 21;
        mehsul[7] = 19;
        mehsul[8] = 18;
        mehsul[9] = 5;

        int yetersiz = 0;

        System.out.println("Yekun Nəticələr: ");

        for (int i = 0; i < mehsul.length; i++) {
            if (mehsul[i] < 20) {
                yetersiz++;
                System.out.println("Məhsul: " + (i + 1) + ": " + mehsul[i] + " ədəd. Yetərsiz saydadır!");
            }else
                System.out.println("Məhsul: " + (i+1) + ": " + mehsul[i] + " ədəd. Yerərli Saydadır!");
        }
        int yeterli = mehsul.length -  yetersiz;
        System.out.println("Yetərli məhsul sayı:" + yeterli);
    }
}
