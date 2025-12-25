package Main.L7;

public class Evro implements Currency, CalculateRate {

    private final double evroPrice = 1.99;


@Override
    public double calculateRate (double amount)  {
    double rate = CurrencyConverter.getCommissionRate();
    double commissionAmount = amount * rate;
    double netAmount = amount - commissionAmount;
    System.out.printf("EVRO çevrilməsi üçün xalis məbləğ: %.2f EVRO (Komissiya: %.2f USD)%n", netAmount, commissionAmount);
    return netAmount;
}

    @Override
    public double convertToAzn (double amount) {
    double netAmount = calculateRate(amount);
    double result = netAmount * evroPrice;
        System.out.printf("%.2f USD = %.2f AZN \nMəzənnə: %.2f", netAmount, result, evroPrice);
    return result;
    }

}
