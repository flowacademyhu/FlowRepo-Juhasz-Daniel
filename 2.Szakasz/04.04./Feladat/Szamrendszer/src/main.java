public class main {

    public static void main(String... args) {

        System.out.println(binStringToInt("10001"));
        System.out.println(everyNumRendszer("10001", 9));

        System.out.println(numToStringWithNumRendszer(131, 2));
        System.out.println(numToStringWithNumRendszer16(53455324, 16));

    }

    static int binStringToInt(String n) {
        // return Integer.parseInt(n, 2);
        int k = 0;
        int result = 0;
        for ( int i = n.length()-1; i >= 0; i--) {
            if (n.charAt(i) == '1') {
                result += 1 * Math.pow(2, k);
                k++;
            } else {
                result += 0 * Math.pow(2, k);
                k++;
            }
        }
        return result;
    }

    static int everyNumRendszer(String n, int numrendszer) {
        // return Integer.parseInt(n, 2);
        int k = 0;
        int result = 0;
        for ( int i = n.length()-1; i >= 0; i--) {
                result += Integer.parseInt(String.valueOf(n.charAt(i))) * Math.pow(numrendszer, k);
                k++;
        }
        return result;
    }

    static String numToStringWithNumRendszer(int num, int numrendszer) {
        String result = "";
        while (num != 0) {
            int rest = num % numrendszer;
            result += String.valueOf(rest);
            num = num / numrendszer;
        }
        String finalResult = "";
        for(int i = result.length()-1; i >= 0; i--) {
            finalResult += result.charAt(i);
        }

        return finalResult;
    }

    static String numToStringWithNumRendszer16(int num, int numrendszer) {

        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';
        char e = 'E';
        char f = 'F';

        String result = "";
        while (num != 0) {
            int rest = num % numrendszer;
            if (rest == 10) {
                result += String.valueOf(a);
            } else if (rest == 11) {
                result += String.valueOf(b);
            }  else if (rest == 12) {
                result += String.valueOf(c);
            } else if (rest == 13) {
                result += String.valueOf(d);
            } else if (rest == 14) {
                result += String.valueOf(e);
            } else if (rest == 15) {
                result += String.valueOf(f);
            } else {
                result += String.valueOf(rest);
            }
            num = num / numrendszer;
        }
        String finalResult = "";
        for(int i = result.length()-1; i >= 0; i--) {
            finalResult += result.charAt(i);
        }

        return finalResult;
    }

}
