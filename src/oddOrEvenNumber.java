import java.util.Scanner;

/**
 * Created by Alexey on 26.06.2015.
 */
public class oddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = scanner.nextInt();
        int result = (n % 2);
        if (result == 0){
            System.out.println("Number is odd (Chislo chetnoe)");
        }else
            System.out.println("Number is even (Chislo nechetnoe)");
    }
}
