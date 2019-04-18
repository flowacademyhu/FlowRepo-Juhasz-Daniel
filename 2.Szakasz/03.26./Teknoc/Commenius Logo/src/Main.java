import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Map map = new Map (10, 10);

        map.drawMap();

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, várom az utasításaidat!");

        String str = scan.nextLine();

        while ( !str.equals("KILÉP")){
            map.doCommand(str);
            map.drawMap();
            str = scan.nextLine();
        }



    }

}
