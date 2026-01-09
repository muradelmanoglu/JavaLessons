package Mentor.L12.InteractivePaymentLogger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Payment {
    private static int counterId = 1000;
    private int orderId;
    private double price;
    private String status;
    private String timestamp;

    public Payment(double price, String status) {
        this.orderId = counterId++;
        this.price = price;
        this.status = status.toUpperCase();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.timestamp = dtf.format(LocalDateTime.now());
    }

    public String getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[PAYMENT_" + status + "] Order#" + orderId + " | " + "Qiyməti " + price + " Azn | " + timestamp;
    }
}
