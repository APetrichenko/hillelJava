package com.alexey.lesson_11;

import java.util.*;

/**
 * Created by ITHILLEL6 on 24.07.2015.
 */
public class QueueTest {
    static String data =
//            "kh((((((())))))fghfh5gfh) ()((()))((((((())))))()()";
            "(()))";
    public static void main(String[] args) {
        System.out.println(isCorrect(data));

    }
    public static boolean isCorrect(String string) {
        Stack stack = new Stack();

//        Queue queue = new ArrayQueue<>();
        Deque queue = new ArrayDeque<>();

        ArrayList l;
        LinkedList ll;
        queue.poll();

        new TreeSet();

        return stack.isEmpty();
    }
}


