package Main.L7;

public class CurrencyConverter {

    private static double commissionRate = 0.01;

    private CurrencyConverter() {

    }

    public static double getCommissionRate() {
        return commissionRate;
    }

    public static void setCommissionRate (double newRate) {
        if (newRate > 0 && newRate < 1) {
            commissionRate = newRate;
        }
    }
}
