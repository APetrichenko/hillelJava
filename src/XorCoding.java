/**
 * Created by Alexey on 6/30/15.
 */
public class XorCoding {

        public static void main(String[] args) {
            String message = "Hello";
            for (char ch: ( message.toCharArray()){
                System.out.println(ch);
            }

            char key = 'a';
            String [] a = {"W","S","S","A"};
            a = expandArray(a, 1);
            a[4] = "New Element";
/*
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
        */
            for (String el: a){
                System.out.println(el);
            }

        }
        public static String encode(String message, char key){
            message.toCharArray();
            return null;//TODO
        }

        public static String[] expandArray(String[] inArray, int expandBy) {
            int initLength = inArray.length;d
            String[] result = new String[initLength+expanBy];
            for (int i = 0; i <inArray.length;i++){
                result[i] = inArray[i];
            }
            return result;
        }

}
