public class Hulladek {

    private String HULLADEK_FEM = "fem";
    private String HULLADEK_UVEG = "uveg";
    private String alapanyag;
    private String leiras;
    private int tomeg;

    protected Hulladek(String alapanyag) {
        this.alapanyag = alapanyag;
        this.leiras = "";
        this.tomeg = 1;
    }

    public void megsemmisit() {
        System.out.println(alapanyag + leiras + tomeg);
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public String getAlapanyag() {
        return alapanyag;
    }

    public void setAlapanyag(String alapanyag) {
        this.alapanyag = alapanyag;
    }
}
