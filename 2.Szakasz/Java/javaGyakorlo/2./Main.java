public class Main {
  public static void main(String[] args) {

    int n = 5;

    Avg(Sum(args), args.length);
    whichOne(args);
    System.out.println(nFibonacci(n));

    //String[] foods = {"Pizza", "Gyros", "Hamburger", "Taco", "Hot-Dog"};

    //basicArrayParam(null);
    //threeDotArrayParam("a","b","c","d","e");
  }

  /* public static void basicArrayParam(String[] strings) {
    for(String string: strings) {
      System.out.println(string);
    }
  }

  public static void threeDotArrayParam(String... strings) {
    for(String string: strings) {
      System.out.println(string);
    }
  } */

   public static int Sum(String[] sum) {
    int finalsum = 0;
    for(int i = 0; i < sum.length; i++) {
      int number = Integer.parseInt(sum[i]);
      finalsum += number;
    }
    System.out.println(finalsum);
    return finalsum;
  }

  public static void Avg(int avg,int nums) {
    int finalavg = 0;
    System.out.println(finalavg = avg / nums);
  }

  public static void whichOne(String[] array) {
    for(int i = 1; i < array.length - 1; i++) {
      if((Integer.parseInt(array[i]) - Integer.parseInt(array[i-1])) + Integer.parseInt(array[i]) == Integer.parseInt(array[i+1])) {
        System.out.println("Szamtani sorozat");
        break;
      }
      else if(Integer.parseInt(array[i]) / Integer.parseInt(array[i-1]) * Integer.parseInt(array[i]) == Integer.parseInt(array[i+1])){
        System.out.println("Mertani sorozat");
        break;
      }
      else if(Integer.parseInt(array[i]) + Integer.parseInt(array[i-1]) == Integer.parseInt(array[i+1])){
        System.out.println("Fibonacci sorozat");
        break;
      }
      else {
        System.out.println("Egyik sem");
        break;
      }
    }
  }

  public static int nFibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return nFibonacci(n-1) + nFibonacci(n-2);
  }
}