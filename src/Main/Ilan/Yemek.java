package Main.Ilan;

public class Yemek {
    public int  x;
public int y;

public Yemek(int en, int hundurluk) {
    yeniYerSec(en, hundurluk);
}

public void yeniYerSec(int en, int hundurluk) {
    this.x = (int) (Math.random() * (en - 2) + 1);
    this.y = (int) (Math.random() * (hundurluk - 2) + 1);
}

}
