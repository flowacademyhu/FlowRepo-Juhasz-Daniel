import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String... args) {
        heron(args);
    }

    public static void heron(String[] list) {
        double s = Integer.parseInt(list[0]) + Integer.parseInt(list[1]) + Integer.parseInt(list[2]);
        System.out.println(Math.sqrt(s * (s - Integer.parseInt(list[0])*(s-Integer.parseInt(list[1])*(s-Integer.parseInt(list[2]))))));
    }
}
