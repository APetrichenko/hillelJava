package com.alexey.oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Fish extends Pets {
    public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Fish() {
    }

    public String phrase() {
        return "....";
    }
}
