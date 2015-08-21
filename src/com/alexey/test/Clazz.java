package com.alexey.test;

/**
 * Created by NewClass7 on 21.08.2015.
 */
public class Clazz {
    int x = 2;
    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Clazz c = new ChildClazz();
        System.out.println(c.x + " " + c.getX());
    }
}
