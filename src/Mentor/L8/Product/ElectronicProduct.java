package Mentor.L8.Product;

    public class ElectronicProduct extends Product implements DiscountApplicable {
        private String warrantyPeriod;


        public ElectronicProduct(String name, double price, int stock, String warrantyPeriod) {
            super(name, price, stock);
            this.warrantyPeriod = warrantyPeriod;
        }


        @Override
        public void displayInfo() {
            System.out.println("Electronic: " + getName() + ", Qiyməti: " + String.format("%.2f", getPrice()) +
                    " AZN, Stock: " + getStock() + " ədəd, Qarantiya: " + warrantyPeriod + ".");
        }


        @Override
        public double calculateDiscount(double discountPercentage) {
            double currentPrice = getPrice();
            double discountedPrice = currentPrice * (1 - discountPercentage);
            return discountedPrice;
        }
    }
