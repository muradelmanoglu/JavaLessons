package Elaveler.OOP;

public class ExpressShipping implements ShippingMethod {

    double expressShippingFee = 4.00;

    @Override
    public double calculateTotalCost(double weightKg) {
        double total = weightKg * expressShippingFee;
        double totalCost = total + ShippingCalculator.getBaseFee();
        System.out.println("Sizin karqonun göndərilmə rüsümü " + total + " Azn. Saxlan haqqı: " + ShippingCalculator.getBaseFee() + " Azndir.");
        System.out.println("Toplam tutar: " + totalCost + " Azndir.");
        return totalCost;
    }
}
