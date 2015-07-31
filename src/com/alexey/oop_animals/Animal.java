package com.alexey.oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public abstract class Animal {
    private int id;
    public int age;
    public double weight;
    public String color;


    public Animal(int id, int age, double weight, String color){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal() {
    }


    public void say(){
        System.out.println(phrase());
    }

    public String phrase(){
        return "Hello ";
    }

//    public abstract void move(){}

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
