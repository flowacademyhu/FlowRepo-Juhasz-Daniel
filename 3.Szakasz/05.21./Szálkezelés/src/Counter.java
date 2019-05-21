public class Counter implements Runnable {

    long waitTime = 2000;
    long alsoKorlat = 1;
    long felsoKorlat = 200;

    Thread t1 = new Thread();

    @Override
    public void run(){

        for(long i = alsoKorlat; i <= felsoKorlat; i++) {
            System.out.println(i);
            try {
                t1.sleep(waitTime);
            } catch (InterruptedException e){
                e.getMessage();
            }
        }

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e){
            e.getMessage();
        }

    }
}
