package com.alexey.thread_cerating;

/**
 * Created by NewClass7 on 21.08.2015.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("User thread " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
