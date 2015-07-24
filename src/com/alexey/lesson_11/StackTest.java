package com.alexey.lesson_11;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by ITHILLEL6 on 24.07.2015.
 */
public class StackTest {
    static String data =
//            "kh((((((())))))fghfh5gfh) ()((()))((((((())))))()()";
    "(()))";
    public static void main(String[] args) {
        System.out.println(isCorrect(data));

    }
    public static boolean isCorrect(String string) {
        java.util.Stack stack = new java.util.Stack();
        for (char ch : string.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                try {
                    stack.pop();
                } catch (EmptyStackException e) {
                    return false;
                }

            }

        }return stack.isEmpty();
    }
}
