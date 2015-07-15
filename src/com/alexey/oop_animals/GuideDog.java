package com.alexey.oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class GuideDog extends Dog{
    public boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public GuideDog() {
    }

    public String phrase(){
        String result = super.phrase();
        if(isTrained){
            result+=" I can take you home.";
        }
        return result;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }
}
