package tread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 212361198 on 8/31/16.
 */
public class Decrementer implements Runnable {
    CountDownLatch latch;

    Decrementer(CountDownLatch latch) {
        this.latch = latch;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            this.latch.countDown();

            Thread.sleep(1000);
            this.latch.countDown();

            Thread.sleep(1000);
            this.latch.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CountDownLatch latch =  new CountDownLatch(3);
        Waiter waiter = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter)     .start();
        new Thread(decrementer).start();
    }
}
