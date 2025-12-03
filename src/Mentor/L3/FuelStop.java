import java.util.Scanner;

public class FuelStop {
    public static void main(String[] args) {

        int hedd = 20;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Yanacaq Səviyyəsi: " + hedd + "Litr");
            System.out.println("Neçə Litr Yanacaq Doldurdunuz :" );
            int doldurulanYanacaq = sc.nextInt();

            hedd += doldurulanYanacaq;
            if (hedd >= 80) {
                System.out.println("Yanacaq hədəfə çatdı. Səfərə davam!");
                break;
            }else
                System.out.println("Yanacaq yenə də azdır. Növbəti məntəqəyə gedirik...");

        }
    }
}
