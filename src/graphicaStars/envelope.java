package graphicaStars;

import java.util.Scanner;

/**
 * Created by Alexey on 6/26/15.
 */
public class envelope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of stars on the X and Y axis");
        int x = scanner.nextInt();
        int y = x;

        for (int i = 0;i <= y; i++) {
            for (int j = 0; j <= x; j++) {
                if (i == y - j || i == j || j == 0 || j == x || i == 0 || i == y ) {
                    System.out.print("*");
                } else  System.out.print(" ");
            }
            System.out.print('\n');
        }

    }

}
