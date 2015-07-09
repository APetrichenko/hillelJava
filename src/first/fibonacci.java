package first;

import java.util.Scanner;

/**
 * Created by Alexey on 29.06.2015.
 */
public class fibonacci {

    public static void main(String[] args){

        System.out.print("Enter n value: ");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int fibN = fib(n);
        System.out.print("Fib (" + n + ") =" + fibN);
    }

    public static int fib (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (fib(n-1) + fib(n-2));
    }
//F(n)=F(n-1)+F(n-2) furmula
}
