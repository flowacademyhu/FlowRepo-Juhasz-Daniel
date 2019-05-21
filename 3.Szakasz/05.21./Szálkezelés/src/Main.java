public class Main {

    public static void main(String[] args) throws Exception{

        /*Counter counter = new Counter();
        counter.run();*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 100; i++) {
                    System.out.println(i);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 100; i <= 200; i++) {
                    System.out.println(i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }

}
