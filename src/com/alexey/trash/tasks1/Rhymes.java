package com.alexey.trash.tasks1;

import java.util.Random;

/**
 * Created by Alexey on 10/8/15.
 */
public class Rhymes {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuffer word = null;
        int r = rnd.nextInt(2);
        switch ( r ) {
            case 1:
                word = new StringBuffer('P');
                break;
            case 2:
                word = new StringBuffer('G');
            default:
                word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println( word );
    }
}