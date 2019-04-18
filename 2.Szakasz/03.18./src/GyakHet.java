public class GyakHet {

    public static void main(String[] args) {
        /*
        //first
        int min = Integer.MAX_VALUE;
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                if (min > Integer.parseInt(args[i])) {
                    min = Integer.parseInt(args[i]);
                }
            }
            System.out.println("minimum: " + min);
        } else {
            System.out.println("nincs 2 szám");
        }


        //second
        int max = Integer.MIN_VALUE;
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                if (max < Integer.parseInt(args[i])) {
                    max = Integer.parseInt(args[i]);
                }
            }
            System.out.println("maximum: " + max);
        } else {
            System.out.println("nincs 2 szám");
        }

        //third
        int sum = 0;
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("összeg: " + sum);
        } else {
            System.out.println("nincs 2 szám");
        }

        //fourth
        if (args.length > 1) {
            System.out.println("átlag: " + (double)sum / args.length);
        } else {
            System.out.println("nincs 2 szám");
        }*/

        //fifth
        /*int[] positives = new int[];
        int k = 0;
        int[] negatives = new int[];
        int l = 0;
        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
               if (Integer.parseInt(args[i]) > 0) {
                   positives[k] = Integer.parseInt(args[i]);
                   k++; IDE JÖHET A MINIMUM/MAX
               } else if (Integer.parseInt(args[i]) < 0) {
                   negatives[l] = Integer.parseInt(args[i]);
                   l++; IDE JÖHET A MINIMUM/MAX
               }
            }

        } else {
            System.out.println("nincs 2 szám");
        }*/

        //fifteen
        /*if ((Integer.parseInt(args[0]) + Integer.parseInt(args[1]) > Integer.parseInt(args[2])) &&
            (Integer.parseInt(args[1]) + Integer.parseInt(args[2]) > Integer.parseInt(args[0])) &&
            (Integer.parseInt(args[0]) + Integer.parseInt(args[2]) > Integer.parseInt(args[1])) &&
            args.length == 3) {
            double kerület = (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2])) / 2;
            double terület = Math.sqrt(kerület * (kerület - Integer.parseInt(args[0])) * (kerület - Integer.parseInt(args[1])) * (kerület - Integer.parseInt(args[2])));
            System.out.println(terület);
            } else {
            System.out.println("Nem 3 a bemeneti paraméter / nem lehet 3szög");
        }*/

        /*
        //sixteen
        int[] array = new int[6];
        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            int randomNum = (int)Math.floor(Math.random() * 6 + 1);
            System.out.println(randomNum + " RANDOM KOCKADOBÁS");
            array[randomNum - 1]++;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        double percentage = (double)array[0] / Integer.parseInt(args[0]);
        System.out.println(percentage + " %");
        */

        //twenty-one


    }
}
