package haziallatok;

public class Sziami extends Macska {

    private boolean kenyes;

    public boolean isKenyes() {
        return kenyes;
    }

    public Sziami(float height, int numOfLegs, boolean kenyes) {
        super(height, numOfLegs);
        this.kenyes = kenyes;
    }

    @Override
    public String toString() {
        return "Sziami cica " + getHeight() + " cm magas, " + getNumOfLegs() + " darab laba van, és kényes e: " + kenyes;
    }
}
