import haziallatok.Macska;

public class Harc {

    public Macska harcol(Macska m1, Macska m2){
        if ( m1.getNumOfLegs() > m2.getNumOfLegs()) {
            return m1;
        } else if ( m2.getNumOfLegs() > m1.getNumOfLegs()) {
            return m2;
        } else if ( m2.getHeight() > m1.getHeight()+2.5f) {
            return m2;
        } else if ( m1.getHeight() > m2.getHeight()+2.5f) {
            return m1;
        } else if ( ) {

        } else {
            return m1;
        }
    }
}
