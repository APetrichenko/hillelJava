package com.alexey.datastructures.arraylist;

import com.alexey.oop_animals.Animal;

import java.util.Comparator;

/**
 * Created by Alexey on 31.07.2015.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Animal animalOne = (Animal)o1;
        Animal animalTwo = (Animal)o2;

        int ageOne = animalOne.getAge();
        int ageTwo = animalTwo.getAge();

        return Integer.compare(ageOne,ageTwo);
    }
}
