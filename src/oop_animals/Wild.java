package oop_animals;



/**
 * Created by Alexey on 7/9/15.
 */
public class Wild extends Animal {
    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public Wild() {
    }

    public String phrase(){
        String result = super.phrase();
        result+= "I am a wild animal ";
        if(isPredator){
            result+= "and I am angry.";
        }
        return result;
    }

    public boolean isPredator() {
        return isPredator;
    }


    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }
}
