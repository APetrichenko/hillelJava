package FirstAndSecondHW;

import java.util.Scanner;

/**
 * Created by Alexey on 26.06.2015.
 */
public class deposit {
    public static void main(String[] args) {
        System.out.println("Please enter sum of FirstAndSecondHW.deposit (UAH)");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();
        System.out.println("Please enter annual percent rate");
        double rate = scanner.nextDouble();
        System.out.println("Please enter FirstAndSecondHW.deposit duration");
        double years = scanner.nextDouble();

        int i;

        for (i=1; i<=years; i++){
            sum = sum + (sum * rate) / 100;
            System.out.println("After " + i + " years amount will be: " + sum +" UAH");
        }
    }
}
