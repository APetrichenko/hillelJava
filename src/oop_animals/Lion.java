package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Lion extends Wild{
    public boolean isPredator;

    public Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}
