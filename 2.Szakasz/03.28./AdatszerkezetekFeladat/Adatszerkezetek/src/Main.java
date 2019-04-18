import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < args.length; i++) {
            list.add(i, Integer.parseInt(args[i]));
        }
        
        printList(list);

        System.out.println(isNumIn1(list, 210));

        System.out.println(isNumIn2(list, 30));

        System.out.println(noMoreEven(list));

        Scanner scan = new Scanner(System.in);

        List<Integer> userList = new ArrayList<>();

        while ( userList.size() != 3 ) {

            userList.add(scan.nextInt());

        }

        System.out.println(userList);

        System.out.println(list.containsAll(userList));


    }

    static void printList(List array) {
        System.out.println(array.toString().replace("[", "").replace("]", ""));
    }

    // a két következő ugyan az

    static boolean isNumIn1(List<Integer> array, int num) {
        for ( int i = 0; i < array.size(); i++) {
            if (array.get(i) == (num)) {
               return true;
           }
        }
        return false;
    }

    static boolean isNumIn2(List<Integer> array, int num) {
        return array.contains(num);
    }

    static List<Integer> noMoreEven(List<Integer> array) {
        for (int i = array.size()-1; i >= 0; i--) {
            if(array.get(i) % 2 == 0) {
                array.remove(i);
            }
        }
        return array;
    }

}
