package calc;

import java.util.Scanner;

/**
 * Created by Alexey on 23.06.2015.
 */
public class calc {
    public static void main(String[] args) {
        System.out.println("Please input first number");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        System.out.println("Please input second number");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
        double diff = num1 - num2;
        System.out.println("Difference = " + diff);
        double mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
        double div = num1 / num2;
        System.out.println("Division = " + div);
    }
}