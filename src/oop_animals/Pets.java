package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Pets extends Animal {
    public boolean isVaccinated;
    public String name;

    public Pets(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

   // public Pets() {
    //}

    public String phrase(){
        String result = super.phrase();
        if(name != null){
            result += "my name is " + getName();
        }
        return result;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
