package FirstAndSecondHW.graphicaStars;

import java.util.Scanner;

/**
 * Created by Alexey on 6/26/15.
 */
public class envelope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of stars for width and height");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

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
