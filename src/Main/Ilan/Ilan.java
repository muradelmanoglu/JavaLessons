package Main.Ilan;

public class Ilan {
    public Kordinat[] beden;
    public int uzunluq;
    public char istiqamet;


public Ilan(int startX, int startY) {
    beden = new Kordinat[200];
    uzunluq = 3;
    istiqamet = 'R';

    for (int i = 0; i < uzunluq; i++) {
        beden[i] = new Kordinat(startX - i, startY);
    }

}

public void hereketEt() {
    for (int i = uzunluq - 1; i > 0; i--) {
    beden[i].x = beden[i - 1].x;
    beden[i].y = beden[i - 1].y;
    }

    if (istiqamet == 'U') beden[0].y--;
    if (istiqamet == 'D') beden[0].y++;
    if (istiqamet == 'L') beden[0].x--;
    if (istiqamet == 'R') beden[0].x++;
}

public void uzat() {
    beden[uzunluq] = new Kordinat(beden[uzunluq - 1].x, beden[uzunluq - 1].y);
    uzunluq++;
    }

}
