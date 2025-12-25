package Elaveler.OOP;

public class Main {
    public static void main(String[] args) {

        System.out.println("CodePolis Karqo Şirkəti!");

        System.out.println("5 Kq yük üçün hesablamalar aşağıdakı kimidi!");
        System.out.println("____________________________________________________________________________");
        System.out.println("Standart: ");
        System.out.println("____________________________________________________________________________");
        ShippingMethod shippingMethod = new StandardShipping();
double kq = 5;
double stship = shippingMethod.calculateTotalCost(kq);

        System.out.println("____________________________________________________________________________");
        System.out.println("Expres: ");
        System.out.println("____________________________________________________________________________");
        ShippingMethod shippingMethod2 = new ExpressShipping();
double kq2 = 5;
double stship2 = shippingMethod2.calculateTotalCost(kq2);
    }

}
