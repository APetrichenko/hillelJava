package com.alexey.thread_cerating;

import com.alexey.thread_cerating.runnable.Worker;

/**
 * Created by NewClass7 on 21.08.2015.
 */
public class App {
    public static void main(String[] args) {

        //single threaded
 //      Thread thread = new MyThread();
//        thread.run();
//        printTenNumbersWithDelay();

        //multi threaded
//        System.out.println("\n Another try\n");
  //      thread.start();
        printTenNumbersWithDelay();

        Runnable run = new Worker();
        Thread thread = new Thread(run);
        thread.start();
    }


    public static void printTenNumbersWithDelay() {
        for (int i=0;i<10;i++) {
            System.out.println("Main thread "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
