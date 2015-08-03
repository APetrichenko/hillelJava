package com.alexey.oop_animals.observers;

import com.alexey.oop_animals.observable.Observer;

/**
 * Created by Alexey on 03.08.2015.
 */
public class HaircutObserver implements Observer {
    @Override
    public void handle() {
        System.out.println("Going to cat hair");
    }
}
