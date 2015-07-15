package com.alexey.oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Crocodile extends Wild{
    public boolean isPredator;


    public Crocodile(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Crocodile() {
    }

}
