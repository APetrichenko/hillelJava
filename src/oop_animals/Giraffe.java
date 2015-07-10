package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Giraffe extends Wild {
    public Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Giraffe() {
    }

    public String toString(int num){
        String result = "";
        result += "Id: " + getId();
        result += " Age: " + getAge();
        result += " Color: "+ getColor();
        result += " isPredator: "+ isPredator();
        return result;

    }
}
