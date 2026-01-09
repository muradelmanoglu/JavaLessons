package Mentor.L12.InteractivePaymentLogger;

import java.io.*;

public class PaymentLogger {

    private final String path = "/Users/muradelmanoglu/Documents/GitHub/JavaLessons/src/Mentor/L12/InteractivePaymentLogger/Payments/";

    private final String logs = path + "/payments.log";
    private final String successLogs = path + "/successful_payments.txt";
    private final String failedLogs = path + "/failed_payments.txt";

    public void addPayment(Payment payment) {

        ensureDirectoryExists();

        writeToFile(logs, payment.toString());

        if (payment.getStatus().equals("SUCCESS")) {
            writeToFile(successLogs, payment.toString());
        } else {
            writeToFile(failedLogs, payment.toString());
        }
        System.out.println("Sistem: Ödəniş qeydə alındı.");
    }

    private void writeToFile(String fileName, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Fayla yazarkən xəta: " + e.getMessage());
        }
    }

    public void showStatistics() {
        int total = countLines(logs);
        int success = countLines(successLogs);
        int failed = countLines(failedLogs);

        System.out.println("     ÖDƏNİŞ STATİSTİKASI     ");
        System.out.println("Ümumi ödəniş sayı: " + total);
        System.out.println("Uğurlu ödənişlər : " + success);
        System.out.println("Uğursuz ödənişlər: " + failed);
    }

    private int countLines(String fileName) {
        int lines = 0;
        File file = new File(fileName);
        if (!file.exists()) return 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) lines++;
        } catch (IOException e) {
            return 0;
        }
        return lines;
    }


    private void ensureDirectoryExists() {
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }
}