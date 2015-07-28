package com.alexey.patterns.strategy1;

import com.alexey.patterns.strategy1.Duck;

/**
 * Created by ITHILLEL6 on 21.07.2015.
 */
public class MAin {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedheadDuck();
        mallard.swim();
        redHead.swim();

        mallard.quack();
        redHead.quack();

        mallard.display();
        redHead.display();
    }

}
