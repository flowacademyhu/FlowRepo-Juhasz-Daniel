public class CD implements Rendelheto{

    private String eloAdo;

    private  String album;

    @Override
    public void rendel(int num) {
        System.out.println("Rendelni kell " + num + " CD-t az alabbibol: " + toString() + " , a CD osztályban");
    }

    @Override
    public String toString() {
        return "CD{" +
                "eloAdo='" + eloAdo + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

    public CD(String eloAdo, String album) {
        this.eloAdo = eloAdo;
        this.album = album;
    }

    public String getEloAdo() {
        return eloAdo;
    }

    public void setEloAdo(String eloAdo) {
        this.eloAdo = eloAdo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
