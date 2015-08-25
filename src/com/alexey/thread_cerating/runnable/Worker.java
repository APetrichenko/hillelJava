package com.alexey.thread_cerating.runnable;

/**
 * Created by NewClass7 on 25.08.2015.
 */
public class Worker implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
