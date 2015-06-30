package FirstAndSecondHW.calc;

import java.util.Scanner;

/**
 * Created by Alexey on 23.06.2015.
 */
public class calc {
    public static void main(String[] args) {
while(true) {
    System.out.println("Please input first number");
    Scanner scanner = new Scanner(System.in);
    double num1 = scanner.nextDouble();


    System.out.println("Please input second number");
    double num2 = scanner.nextDouble();
    if (num2 == 0) {
        System.out.println("Wrong digit! Please enter another");
        System.out.println("Input second number");
        num2 = scanner.nextDouble();
    }

    System.out.println("Please choose operation and input: + - * /");
    String oper = scanner.next();
    if (oper.equals("+")) {
        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
    } else if (oper.equals("-")) {
        double diff = num1 - num2;
        System.out.println("Difference = " + diff);
    } else if (oper.equals("*")) {
        double mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
    } else if (oper.equals("/")) {
        double div = num1 / num2;
        System.out.println("Division = " + div);
    } else {
        System.out.println("You enter wrong symbol, please try again");
    }
}

       /*
        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
        double diff = num1 - num2;
        System.out.println("Difference = " + diff);
        double mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
        double div = num1 / num2;
        System.out.println("Division = " + div);
        */
    }
}