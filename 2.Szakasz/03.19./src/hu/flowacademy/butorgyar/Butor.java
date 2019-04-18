package hu.flowacademy.butorgyar;

public class Butor {

    private int lap;
    private Butorlap[] lapok;

    public Butor() {
        this.lapok = new Butorlap[100];
        lap = 0;
    }

    public void laphozzaad(Butorlap butorlap) {
        lapok[lap]=butorlap;
        this.lap++;
    }

    public int arSzamol () {
        int szamol = 0;
        for (int i = 0; i < lapok.length; i++){
            szamol += lapok[i].arSzamol();
        }
        return  szamol;
    }

}
