package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Animals {
    private int id;
    public int age;
    public int weight;
    public String color;


    public String Voice (String voice){
        System.out.println("Hello, ");
        return voice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
