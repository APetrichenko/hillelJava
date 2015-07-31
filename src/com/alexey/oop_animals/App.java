package com.alexey.oop_animals;

import com.alexey.oop_animals.observable.Observer;
import com.alexey.oop_animals.observers.HungryObserver;
import com.alexey.oop_animals.observers.SicknessObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alexey on 10.07.2015.
 */
public class App {

    public static Giraffe giraffe;

    public static List init() {
        List zoo = new ArrayList();

        Cat cat = new Cat(1,3,3.4,"Grey","Murka",true);
        zoo.add(cat);
        Lion lion = new Lion(2,10,90,"Yellow",true);
        zoo.add(lion);
        Dog dog = new Dog(3,7,16,"Black","Tuzik",true);
        zoo.add(dog);
        Fish fish = new Fish(4,3,0.2,"Gold","Karas'",false);
        zoo.add(fish);
        GuideDog cleverDog = new GuideDog(5,10,10,"White","Sharik",true,true);
        zoo.add(cleverDog);
        GuideDog notCleverDog = new GuideDog(6,1,3,"Grey","Muhtar",true,false);
        zoo.add(notCleverDog);
        giraffe = new Giraffe(7,33,36,"Spot",false);
        zoo.add (giraffe);
        return zoo;

//        Animal animal = new Animal();
//        animal.say();


        //Animal animal = new Animal();

//        for (Animal an : zoo){
//            an.say();
//        }
//
//        System.out.println(zoo);

//        cat.say();
//        lion.say();
//        dog.say();
//        fish.say();
//        cleverDog.say();
//        notCleverDog.say();

//        List list = Arrays.asList(zoo);
//
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            Object elem = iterator.next();
//            ((Animal)elem).say();
//        }
//
    }
//    private static void zooVoice(Animal[] zoo) {
//
//    }
//    private static void roarVoice(Object[] zoo) {
//        for (Object an : zoo){
//            if(an instanceof Roarable) {
//                ((Roarable) an).roar();
//            }else
//            {
//                System.out.println("NOT");
//            }
//        }
//    }



//    private static void printStatus(List zoo) {
//        if(isAnybodyHungry(zoo)){
//            System.out.println("Go and feed him");
//        } else {
//            System.out.println("Free time");
//        }
//    }

//    public static boolean isAnybodyHungry(List zoo){
//        for(Object o : zoo){
//            Animal animal = (Animal) o;
//            if(animal.isHungry()){
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        Observer doctor = new SicknessObserver();
        Observer feeder = new HungryObserver();

        Hamster hamster = new Hamster();
        Fish fish = new Fish();

        hamster.addObserver(doctor);
        hamster.addObserver(feeder);

        fish.addObserver(feeder);

        hamster.notifyObservers();

        fish.notifyObservers();
    }

}
