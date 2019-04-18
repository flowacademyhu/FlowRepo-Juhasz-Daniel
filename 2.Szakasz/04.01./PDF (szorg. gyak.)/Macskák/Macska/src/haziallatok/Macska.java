package haziallatok;

public class Macska {

    private float height;
    private int numOfLegs;

    public Macska() {
        this.height = 15.0f;
        this.numOfLegs = 4;
    }

    @Override
    public String toString() {
        return "Marmagassag: " + height +
                " cm. Labak szama: " + numOfLegs
                + " darab.";
    }

    public Macska(float height, int numOfLegs) {
        this.height = height;
        this.numOfLegs = numOfLegs;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
