import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SZTEJegyzetbolt {

    private static List<Konyv> konyvek = new ArrayList<>();

    private static List<CD> cd = new ArrayList<>();

    public static void main (String... args) {

        rendelesFelvesz("/home/dani/FLOW2019/03.21./Gyak/Feladat/rendeles.txt");

        rendel();

    }

    private static void rendelesFelvesz(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String s = br.readLine();

            while ( s != null) {
                String[] array = s.split(";");
                if (array[0].equalsIgnoreCase("peldatar")) {
                    Peldatar p = new Peldatar(array[1], array[2], Integer.parseInt(array[3]));
                    konyvek.add(p);
                } else if (array[0].equalsIgnoreCase("regeny")) {
                    Regeny p = new Regeny(array[1], array[2], array[3]);
                    konyvek.add(p);
                } else {
                    CD p = new CD(array[1], array[2]);
                    cd.add(p);
                }
                s = br.readLine();
            }
        } catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException d){
            System.out.println(d);
        }

    }

    private static void rendel(){
        for (Konyv a : konyvek) {
            if (a instanceof Rendelheto){
                ((Regeny) a).rendel(12);
            }
        }
        for (CD a : cd) {
            a.rendel(23);
        }
    }

}
