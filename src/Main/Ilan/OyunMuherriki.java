package Main.Ilan;

public class OyunMuherriki {

    private Ilan ilan;
    private Yemek yemek;
    private int en, hundurluk;
    private boolean gameOver = false;

    public OyunMuherriki(int e, int h){
        this.en = e;
        this.hundurluk = h;
        this.ilan = new Ilan(e/2,h/2);
        this.yemek = new Yemek(e,h);
    }

    public void yenile () {
        if(gameOver) return;

        ilan.hereketEt();

        if (ilan.beden[0].x <= 0 || ilan.beden[0].x >= en - 1 || ilan.beden[0].y <= 0 || ilan.beden[0].y >= hundurluk - 1) {
            gameOver = true;
        }

        for (int i = 1; i < ilan.uzunluq; i++ ) {
            if (ilan.beden[0].x == ilan.beden[i].x && ilan.beden[0].y == ilan.beden[i].y) {
                gameOver = true;
                break;
            }
        }

        if (ilan.beden[0].x == yemek.x && ilan.beden[0].y == yemek.y) {
            ilan.uzat();
            yemek.yeniYerSec(en,hundurluk);
        }

    }

    public void game() {
        for (int i = 0; i < 2; i++) System.out.println();

        for (int i = 0; i < hundurluk; i++) {
            for (int j = 0; j < en; j++) {
                if (i == 0 || i == hundurluk - 1 || j == 0 || j == en - 1) {
                    System.out.print("~");
                } else if (i == yemek.y && j == yemek.x) {
                    System.out.print("*");
                } else {
                    boolean var = false;
                    for (int s =0; s < ilan.uzunluq; s ++) {
                        if (ilan.beden[s].x == j && ilan.beden[s].y == i) {
                            System.out.print(s == 0 ? "O" : "o");
                            var = true;
                            break;
                        }
                    }
                    if (!var) System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    public boolean isgameOver() {
        return gameOver;
    }

    public void duymeniEmalEt(char basilanDuyme) {

        if (basilanDuyme == 'w' && ilan.istiqamet != 'D') {
            ilan.istiqamet = 'U';
        } else if (basilanDuyme == 's' && ilan.istiqamet != 'U') {
            ilan.istiqamet = 'D';
        } else if (basilanDuyme == 'a' && ilan.istiqamet != 'R') {
            ilan.istiqamet = 'L';
        } else if (basilanDuyme == 'd' && ilan.istiqamet != 'L') {
            ilan.istiqamet = 'R';
        }
    }
}



