public class Regeny extends Konyv implements Rendelheto {

    private String tartalmiOsszefoglalo;

    public Regeny(String author, String title, String tartalmiOsszefoglalo) {
        super(author, title);
        this.tartalmiOsszefoglalo = tartalmiOsszefoglalo;
    }

    @Override
    boolean dedikalASzerzo() {
        return true;
    }

    @Override
    public void rendel(int num) {
        System.out.println("Rendelni kell " + num + " regenyt az alabbibol: " + toString() + ", a Regeny osztályban");
    }

    @Override
    public String toString() {
        return "Regeny{" +
                "tartalmiOsszefoglalo='" + tartalmiOsszefoglalo + '\'' +
                '}';
    }

    public String getTartalmiOsszefoglalo() {
        return tartalmiOsszefoglalo;
    }

    public void setTartalmiOsszefoglalo(String tartalmiOsszefoglalo) {
        this.tartalmiOsszefoglalo = tartalmiOsszefoglalo;
    }
}
