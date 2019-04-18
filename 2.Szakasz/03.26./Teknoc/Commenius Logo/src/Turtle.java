public class Turtle {

    private int xTurtle;
    private int yTurtle;
    private boolean pen;
    private int xMap;
    private int yMap;

    public Turtle() {
    }

    public int getxTurtle() {
        return xTurtle;
    }

    public void setxTurtle(int xTurtle) {
        this.xTurtle = xTurtle;
    }

    public int getyTurtle() {
        return yTurtle;
    }

    public void setyTurtle(int yTurtle) {
        this.yTurtle = yTurtle;
    }

    public boolean isPen() {
        return pen;
    }

    public int getxMap() {
        return xMap;
    }

    public void setxMap(int xMap) {
        this.xMap = xMap;
    }

    public int getyMap() {
        return yMap;
    }

    public void setyMap(int yMap) {
        this.yMap = yMap;
    }

    public Turtle(int xMap, int yMap) {
        this.xTurtle = 0;
        this.yTurtle = 0;
        this.pen = false;
        this.xMap = xMap;
        this.yMap = yMap;
    }

    public boolean move(String move) {
        if (move.equals("JOBBRA")) {
            if (yTurtle < yMap - 1) {
                yTurtle++;
                return true;
            }
        } else if (move.equals("BALRA")) {
            if (yTurtle > 0) {
                yTurtle--;
                return true;
            }
        } else if (move.equals("LE")) {
            if (xTurtle < xMap - 1) {
                xTurtle++;
                return true;
            }
        } else if (move.equals("FEL")) {
            if (xTurtle > 0) {
                xTurtle--;
                return true;
            }
        }
        return false;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "xTurtle=" + xTurtle +
                ", yTurtle=" + yTurtle +
                ", pen=" + pen +
                ", xMap=" + xMap +
                ", yMap=" + yMap +
                '}';
    }
}

