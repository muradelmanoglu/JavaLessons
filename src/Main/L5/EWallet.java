package Main.L5;

public class EWallet {


    private double balance;

    public EWallet() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    void setDeposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Mədaxil uğurla yerinə yetirildi.");
            System.out.printf("Yeni balans: %.2f", this.balance);
        } else
            System.out.println("Uğursuz Mədaxil cəhdi: Daxil edəcəyiniz məbləğ YALNIZ müsbət olmalıdır!");
    }

    void setWithdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Məxaric uğurla yerinə yetirildi.");
            System.out.printf("Qalan balans: %.2f Azn ", this.balance);
        } else {
            System.out.println("Uğursuz Məxaric cəhdi: Məxaric etmək istədiyiniz məbləğ balansınızdan çox ola bilməz!");
            System.out.printf("Balans: %.2f Azn", this.balance);
        }
    }
}
