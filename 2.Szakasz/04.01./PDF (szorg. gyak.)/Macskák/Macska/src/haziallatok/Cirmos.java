package haziallatok;

public class Cirmos extends Macska {

    private int pofonErosseg = 3;

    public int getPofonErosseg() {
        return pofonErosseg;
    }

    public Cirmos(float height, int numOfLegs, int pofonErosseg) {
        super(height, numOfLegs);
        this.pofonErosseg = pofonErosseg;
    }

    @Override
    public String toString() {
        return "Cirmos cica " + getHeight() + " cm magas, " + getNumOfLegs() + " darab laba van, és " + pofonErosseg + " erosseggel gyepalja a szomszed macskat.";
    }
}
