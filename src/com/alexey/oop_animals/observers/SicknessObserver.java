package com.alexey.oop_animals.observers;

import com.alexey.oop_animals.observable.Observer;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */

//Doctor
public class SicknessObserver implements Observer {
    @Override
    public void handle() {
        System.out.println("Thats not my job");
    }
}
