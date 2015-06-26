import java.util.Scanner;

/**
 * Created by Alexey on 6/26/15.
 */
public class multiplicity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("Аirst number is a multiple of the second ");
        } else {
            System.out.println("Аirst number is NOT multiple of the second");
        }
    }
}
