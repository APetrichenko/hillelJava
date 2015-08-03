package ThirdHW;

/**
 * Created by Alexey on 29.06.2015.
 */
public class SumOfDigitsInNumber {
    public static void main(String[] args){

        int d = 555;// число взято от фонаря
        int e = 0;
        while (d > 0){
            e = e + d % 10;
            d = d / 10;
        }

        System.out.print(e);

    }
}
