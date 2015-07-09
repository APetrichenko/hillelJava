package first;

import java.util.Scanner;

/**
 * Created by Alexey on 29.06.2015.
 */
public class sumOfDigitsInNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number");
        int i = in.nextInt(); // число которое вводим
        int n = 0;           // сумма цифр в числе
        while (i > 0){
            n = n + i % 10;
            i = i / 10;
        }

        System.out.print(n);

    }
}
