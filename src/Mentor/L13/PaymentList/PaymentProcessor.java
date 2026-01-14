package Mentor.L13.PaymentList;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

    public void addPayments(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
    class Main {
        static void main(String[] args) {

            List<Number> numbers = new ArrayList<>();

            PaymentProcessor paymentProcessor = new PaymentProcessor();

            paymentProcessor.addPayments(numbers);

            System.out.println("Ödənişlər: ");
            for (Object item : numbers) {
                System.out.print(item + " ");
            }
        }
    }