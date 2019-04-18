import harcosokklubja.Harcos;
import harcosokklubja.Nagydarab;

import java.util.ArrayList;
import java.util.List;

public class harcosokMain {

    public static void main(String[] args) {

       /* List<harcosokklubja.Harcos> harcosok = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Harcos")) {
                harcosok.add(Harcos args[i] = new Harcos(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2])));
            }
            harcosok.add(args[i]);
        }

        for (int i = 0; i < harcosok.size(); i++) {
            if (harcosok.get(i) "Harcos"){

            }
        } */

       Harcos feri = new Harcos(10, 2);
       Nagydarab zoli = new Nagydarab(4, 10,0);
       harcosokklubjaharc harc = new harcosokklubjaharc();

       harc.meccs(feri, zoli);
    }
}
