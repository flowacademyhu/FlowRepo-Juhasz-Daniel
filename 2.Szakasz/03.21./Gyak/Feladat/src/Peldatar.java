public class Peldatar extends Konyv {

    private int feladatokszama;

    public Peldatar(String author, String title, int feladatokszama) {
        super(author, title);
        this.feladatokszama = feladatokszama;
    }

    @Override
    boolean dedikalASzerzo() {
        return false;
    }

    @Override
    public String toString() {
        return "Peldatar{" +
                "feladatokszama=" + feladatokszama +
                '}';
    }

    public int getFeladatokszama() {
        return feladatokszama;
    }

    public void setFeladatokszama(int feladatokszama) {
        this.feladatokszama = feladatokszama;
    }
}
