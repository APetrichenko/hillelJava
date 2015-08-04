package com.alexey.oop_animals;

/**
 * Created by NewClass7 on 04.08.2015.
 */
//tipizirovanie , <T> eto generic
public class Pair<T,K> {
    public T first;
    public T second;
    public K third;

    public Pair(T first, T second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
