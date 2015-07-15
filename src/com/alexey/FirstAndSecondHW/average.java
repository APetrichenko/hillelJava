package com.alexey.FirstAndSecondHW;

import java.util.Scanner;

/**
 * Created by Alexey on 25.06.2015.
 */
public class average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0; //count of entered numbers
        double sum = 0;
        double x;
        System.out.println("Please enter numbers");
        while (scanner.hasNextDouble()){
            x = scanner.nextDouble();
            sum = sum + x;
            i++;
            System.out.println("Type number to continue or any key to finish");
        }
        double average = sum/i;
        System.out.println("Count of numbers = " + i +" Avarage = " + average );
    }
}
