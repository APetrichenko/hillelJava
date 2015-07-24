package com.alexey.tictactoe;

/**
 * Created by Alexey on 7/24/15.
 */
public class GameLogic {
    public int[] place = new int[9];
    //default
    public AiGameStrategy aiGameStrategy;

    public boolean makeTurn(int position){
        if(place[position]==0){
            place[position] = 1;
            System.out.println("Make step ");
            return true;
            }
         return false;
    }

    public int aIMakeTurn(){
        int pos = aiGameStrategy.aiMakeTurn(place);
        place[pos] = 1;
        return pos;
    }

    public void setAiGameStrategy(AiGameStrategy gameStrategy){
        this.aiGameStrategy = gameStrategy;
    }

    public boolean checkPlayerWin() {
        if (place[0]== 1 && place[1]== 1 &&place[2]== 1) return true;
        if (place[3]== 1 && place[4]== 1 &&place[5]== 1) return true;
        if (place[6]== 1 && place[7]== 1 &&place[8]== 1) return true;
        if (place[0]== 1 && place[3]== 1 &&place[6]== 1) return true;
        if (place[0]== 1 && place[4]== 1 &&place[8]== 1) return true;
        if (place[1]== 1 && place[4]== 1 &&place[7]== 1) return true;
        if (place[2]== 1 && place[5]== 1 &&place[8]== 1) return true;
        if (place[2]== 1 && place[4]== 1 &&place[6]== 1) return true;

        else return false;
    }

    public boolean checkAiWin() {
        if (place[0]== 2 && place[1]== 2 &&place[2]== 2) return true;
        if (place[3]== 2 && place[4]== 2 &&place[5]== 2) return true;
        if (place[6]== 2 && place[7]== 2 &&place[8]== 2) return true;
        if (place[0]== 2 && place[3]== 2 &&place[6]== 2) return true;
        if (place[0]== 2 && place[4]== 2 &&place[8]== 2) return true;
        if (place[1]== 2 && place[4]== 2 &&place[7]== 2) return true;
        if (place[2]== 2 && place[5]== 2 &&place[8]== 2) return true;
        if (place[2]== 2 && place[4]== 2 &&place[6]== 2) return true;

        else return false;
    }

}
