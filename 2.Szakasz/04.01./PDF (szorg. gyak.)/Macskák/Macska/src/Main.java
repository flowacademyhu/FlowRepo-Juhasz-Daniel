import haziallatok.Cirmos;
import haziallatok.Macska;
import haziallatok.Sziami;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cicaharc!!!");

        Sziami sziami = new Sziami(15.0f, 4, true);

        Cirmos cirmos = new Cirmos(20.0f, 4, 2);

        Harc harc = new Harc();

        System.out.println(harc.harcol(sziami, cirmos));

    }

}
