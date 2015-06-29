import java.util.Scanner;

/**
 * Created by Alexey on 29.06.2015.
 */
public class RectangleCoordinates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first X coordinate");
        double x1 = in.nextDouble();
        System.out.println("Input first Y coordinate");
        double y1 = in.nextDouble();
        System.out.println("Input second X coordinate");
        double x2 = in.nextDouble();
        System.out.println("Input second Y coordinate");
        double y2 = in.nextDouble();
        System.out.println("Input your X point");
        double x = in.nextDouble();
        System.out.println("Input your Y point");
        double y = in.nextDouble();

        if (((x > x1)&&(x < x2))&&((y > y1)&&(y < y2))){
            System.out.println("Your point in square coordinates");
        }else{
            System.out.println("Your point out of square coordinates");
        }
    }
}
