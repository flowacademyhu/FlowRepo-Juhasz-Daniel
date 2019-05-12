import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<String> things = new ArrayList();

        things.add("cat");
        things.add("apple");
        things.add("dog");
        things.add("car");
        things.add("question");
        things.add("application");

        things.stream().filter(s -> s.startsWith("c")).forEach(System.out::println);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        things.stream().filter(s -> s.contains("pp")).filter(s -> s.length() > 3).forEach(System.out::println);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        things.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/dani/FLOW2019/3.Szakasz/05.09./fájl.js"));
        List list = bufferedReader
                .lines()
                .map(e -> e.split(";"))
                .map(d -> new Point(Integer.parseInt(d[0]), Integer.parseInt(d[1])))
                .filter(e -> e.getX() == 1)
                .collect(Collectors.toList());
        for (Object i:list
             ) {
            System.out.println(i);
        }



    }

}
