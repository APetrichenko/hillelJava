package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Animals {
    private int id;
    public int age;
    public int weight;
    public String color;

    public Animals (int i, int a, int w, String c){
        id = i;
        age = a;
        weight = w;
        color = c;
    }


    public void voice(String v){
        System.out.println("Hello, ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
