import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Hulladek> hulladek = new ArrayList<>();

    public static void main(String... args) {



    }

    private static void rendelesFelvesz(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String s = br.readLine();

            while (s != null) {

            }
        }
    }
}
