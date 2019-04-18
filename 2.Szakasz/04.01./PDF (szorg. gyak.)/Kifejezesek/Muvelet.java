package kifejezesek;

public class Muvelet extends Kifejezesek{

    int a;
    int b;
    String muvelet;

    boolean kiertekeles = false;

    public Muvelet(int ertek, boolean kiertekeles) {
        super(ertek);
        this.kiertekeles = kiertekeles;
    }
}
