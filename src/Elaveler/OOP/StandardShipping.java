package Elaveler.OOP;

public class StandardShipping implements ShippingMethod {

    double standartShippingFee = 2.50;

    @Override
    public double calculateTotalCost(double weightKg) {
        double total = weightKg * standartShippingFee;
        double totalCost = total + ShippingCalculator.getBaseFee();
        System.out.println("Sizin karqonun göndərilmə rüsümü " + total + " Azn. Saxlan haqqı: " + ShippingCalculator.getBaseFee() + " Azndir.");
        System.out.println("Toplam tutar: " + totalCost + " Azndir.");
        return totalCost;
    }

}
