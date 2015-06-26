import java.util.Scanner;

/**
 * Created by Alexey on 6/26/15.
 */
public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = scanner.nextInt();

        //if (n < 2);
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) {
                System.out.println("Number is NOT prime");
            } else  System.out.println("Number is prime");

    }

}

