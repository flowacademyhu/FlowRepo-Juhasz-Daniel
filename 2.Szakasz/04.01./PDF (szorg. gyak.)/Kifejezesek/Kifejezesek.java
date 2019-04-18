package kifejezesek;

public class Kifejezesek{

    protected int ertek;

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    public Kifejezesek(int ertek) {
        ertek = 0;
        this.ertek = ertek;
    }

    @Override
    public String toString() {
        return "Kifejezesek{" +
                "ertek=" + ertek +
                '}';
    }
}
