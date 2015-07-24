package com.alexey.tictactoe;

/**
 * Created by Alexey on 7/24/15.
 */
public class RandomAiGameStrategy extends AiGameStrategy {
    @Override
    public int aiMakeTurn(int[] field) {
        while(true){
            int randomPlace = (int)(Math.random()*9);
            if(field[randomPlace]==0){
                return randomPlace;
            }
        }
    }
}
