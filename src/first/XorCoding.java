package first;

import java.util.Scanner;

/**
 * Created by Alexey on 6/30/15.
 */

public class XorCoding {

        public static void main(String[] args) {

            String message = "Hello World!";
          //  for (char ch: ( message.toCharArray())) {
            //    System.out.println();
           // }

            String key = "this is a key";
          //  String [] a = {"W","S","S","A"};
            System.out.println(message);
            String encodedMessage = encode(message,key);
            System.out.println(encodedMessage);

            String decodedMessage = encode(encodedMessage,key);
            System.out.println(decodedMessage);


        }


    public static String encode(String message, char key) {
        char[] symbols = message.toCharArray();
        char[] codedArray = new char[message.length()];
        for(int i=0;i<symbols.length;i++){
            char codedSymbol = (char) (symbols[i]^key);
            codedArray[i]=codedSymbol;
        }
        String result = new String(codedArray);
        return result;
    }
    public static String encode(String message, String key) {
        char[] symbols = message.toCharArray();
        char[] keys = key.toCharArray();

        char[] codedArray = new char[message.length()];
        for(int i=0;i<symbols.length;i++){
            char codedSymbol = (char) (symbols[i]^keys[i%keys.length]);
            codedArray[i]=codedSymbol;
        }
        String result = new String(codedArray);
        return result;
    }


}

