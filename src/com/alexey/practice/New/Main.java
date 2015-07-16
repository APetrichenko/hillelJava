package com.alexey.practice.New;

/**
 * Created by Alexey on 16.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass a = new SomeClass();
        System.out.println( a.someMethod() ); // It works
       // System.out.println( a.someField ); // ошибка
        System.out.println( ( (Interface1) a).someField ); // 100
        System.out.println( Interface1.someField ); // 100
    }
}
