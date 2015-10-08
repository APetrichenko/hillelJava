package com.alexey.trash.tasks1;

/**
 * Created by Alexey on 10/8/15.
 */
public class Test {
    public static void main(String [] args) {
        Test t = new Test();
        t.start();
    }

    void start() {
        int x = 7;
        alter(x);
        System.out.println(x);
    }

    void alter(int x) {
        x = x + 2;
    }
}

