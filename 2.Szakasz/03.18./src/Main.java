public class Main {

    public static void main(String[] args) {
        //first
        double n = first();
        int newN = (int)n;
        int sum = sum(newN);
        System.out.println("első: " + sum);

        //second
        int[] array = second(newN);
        int sum2 = sumArray(array);
        System.out.println("számokösszege " + sum2);
        int multi = mulArray(array);
        System.out.println("számokszorzata " + multi);
        int avg = avg(array);
        System.out.println("számokátlaga " + avg);

        //eight
        String hashtag = "#";
        for(int i = 0; i < 5; i++) {
            System.out.println(hashtag);
            hashtag = hashtag + "#";
        }

        //nine
        String space = " ";
        for (int i = 1; i <= newN; i++) {
            System.out.println(space + i);
            space = space + " ";
        }
    }

    public static double first(){
        return Math.floor(Math.random() * (10 - 6)) + 6;
    }

    public static int sum(int num){
        int result = 0;
        for(int i = 1; i <= num; i++) {
            result = result + i;
        }
        return result;
    }

    public static int[] second(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)Math.floor(Math.random() * (10 - (-10))) + (-10);
            System.out.println("másodikfeladatszámai " + array[i]);
        }
        return array;
    }

    public static int sumArray(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    public static int mulArray(int[] array){
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result = result * array[i];
        }
        return result;
    }

    public static int avg(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result / array.length;
    }
}
