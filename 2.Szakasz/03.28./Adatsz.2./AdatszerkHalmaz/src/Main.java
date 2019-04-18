import java.util.*;

public class Main {

    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        // SET

        Set set = Collections.synchronizedSet(new HashSet<Integer>());

        while ( set.size() != 5) {

            set.add(scan.nextInt());

        }

        System.out.println(set);

        // MAP

        scan.nextLine();

        HashMap<Integer, String> map = new HashMap<>();

        String[] array = scan.nextLine().split(" ");

        map.put(Integer.parseInt(array[1]), array[0]);

        System.out.println(map.get(11));
    }
}
