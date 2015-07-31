package com.alexey.oop_animals;

import com.alexey.oop_animals.observable.Observable;
import com.alexey.oop_animals.observable.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 7/9/15.
 */
public class Fish extends Pets implements Observable {

    List<Observer> observers = new ArrayList<Observer>();
    public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Fish() {
    }

    public String phrase() {
        return "....";
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.handle();
        }
    }
}
