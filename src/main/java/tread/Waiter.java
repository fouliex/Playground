package tread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 212361198 on 8/31/16.
 */
public class Waiter implements Runnable {


    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter Released");
    }
}

