package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Cat extends Pets{

    public Cat(int id, int age, double weight, String color, String name,boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Cat() {
    }

    @Override
    public String phrase(){
        String result = super.phrase();
        for (int i=0;i< 5; i++) {
            result += " Meow!";
        }
        return result;
    }

}
