package Main.L7;

public class Usd implements Currency, CalculateRate {

    private final double usdPrice = 1.70;

    @Override
    public double calculateRate (double amount)  {
        double rate = CurrencyConverter.getCommissionRate();
        double commissionAmount = amount * rate;
        double netAmount = amount - commissionAmount;
        System.out.printf("USD çevrilməsi üçün xalis məbləğ: %.2f USD (Komissiya: %.2f USD)%n", netAmount, commissionAmount);
        return netAmount;
    }

    @Override
    public double convertToAzn (double amount) {
        double netAmount = calculateRate(amount);
        double result = netAmount * usdPrice;
        System.out.printf("%.2f USD = %.2f AZN \nMəzənnə: %.2f", netAmount, result, usdPrice);
        return result;

    }

}
