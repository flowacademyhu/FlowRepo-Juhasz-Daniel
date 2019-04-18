import harcosokklubja.Harcos;

public class harcosokklubjaharc {

    public static void meccs(Harcos h1, Harcos h2) {

        System.out.println(h1 + " vs " + h2);

        h1.megut(h2);
        h2.megut(h1);
        h1.megut(h2);
        h2.megut(h1);
        h1.megut(h2);
        h2.megut(h1);

        if ( h1.getHealth() > 0 && h2.getHealth() <= 0) {
            System.out.println(h1 + " győzőtt!");
        } else if ( h2.getHealth() > 0 && h1.getHealth() <= 0) {
            System.out.println(h2 + " győzőtt!");
        } else if ( h1.getHealth() <= 0 && h2.getHealth() <= 0) {
            System.out.println("Döntetlen!");
        } else if ( h1.getHealth() > 0 && h2.getHealth() > 0) {
            System.out.println("Döntetlen!");
        }
    }

}
