package graphicaStars;

import java.util.Scanner;

/**
 * Created by Alexey on 6/26/15.
 */
public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter width");
        int x = scanner.nextInt();
        System.out.println("Please enter height");
        int y = scanner.nextInt();

        for (int i = 0;i <= y; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0 || j == x || i == 0 || i == y ) {
                        System.out.print("* ");
                    } else  System.out.print("  ");
                }
            System.out.print('\n');
            }

        }

    }

