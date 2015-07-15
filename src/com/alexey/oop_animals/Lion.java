package com.alexey.oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Lion extends Wild implements Roarable{
    public boolean isPredator;

    public Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void roar() {
        System.out.println("Lion ROAR");
    }
}
