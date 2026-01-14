package Mentor.L13.PrinterService;

import java.util.ArrayList;
import java.util.List;

public class PrinterService {

    private String info;

    public PrinterService(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static void printAll(List<? extends PrinterService> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}


class Invoice extends PrinterService{

private int ordernumber;

    public Invoice(String info, Integer ordernumber) {
        super(info);
        this.ordernumber = ordernumber;
    }

    @Override
    public String toString() {
        return "İnfo: " + getInfo() + " | Order : " + ordernumber;
    }
}

class Report extends PrinterService{

    private int raportNumber;

    public Report(String info, int raportNumber) {
        super(info);
        this.raportNumber = raportNumber;
    }

    @Override
    public String toString() {
        return "İnfo: " + getInfo() + " | Raport : " + raportNumber;
    }
}

class Certificate extends PrinterService{

    private char certificateSeries;

    public Certificate(String info, char certificateSeries) {
        super(info);
        this.certificateSeries = certificateSeries;
    }

    @Override
    public String toString() {
        return "İnfo: " + getInfo() + " | Sertifikat növü: " + certificateSeries;
    }
}


class Main {
    static void main(String[] args) {

        Invoice invoice = new Invoice("İphone satıldı, Qiyməti: 1500 Azn", 101);
        Report report = new Report("Order 101 xəta verdi, Kartda Yetərli məbləğ yoxdur.", 1);
        Certificate certificate = new Certificate("3D sertifikatı tələbi", 'C');

        List<PrinterService> doc = new ArrayList<>();

        doc.add(invoice);
        doc.add(report);
        doc.add(certificate);

        PrinterService.printAll(doc);
    }

}