package Main.L9;

public class Main {
    public static void main(String[] args) {

        Product phone = new Product("Iphone", 15);

        try {

            phone.sifarisVer(0);
        } catch (OutOfStockException e) {
            System.out.println("Anarda Məhsul bitib! " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Yanlış parametir " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Xəta, Yenidən cəht edin! ");
        }
finally {
            System.out.println("Sonlandırıldı!");
        }

    }
}
