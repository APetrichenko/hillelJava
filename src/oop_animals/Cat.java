package oop_animals;

/**
 * Created by Alexey on 7/9/15.
 */
public class Cat extends Pets {

    public Cat(int i, int a, int w, String c) {
        super(i, a, w, c);
    }


    public void voice(){
        super.voice();
        System.out.println( "Meow" );
    }

}
