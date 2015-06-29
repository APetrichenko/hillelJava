import java.util.Scanner;

/**
 * Created by Alexey on 29.06.2015.
 */
public class sumOfDigitsInNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number");
        int d = in.nextInt();
        int e = 0;
        while (d > 0){
            e = e + d % 10;
            d = d / 10;
        }

        System.out.print(e);

    }
}
