package com.alexey.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by NewClass7 on 11.08.2015.
 */

public class ListOfNumbers {
    private List<Integer> list;
    private int numOfDigits;

    public ListOfNumbers() {
    }


    public void init(int numOfDigits) {
        if (numOfDigits < 0) {
            throw new MinusValueException("Please input positive value");
        }
        this.numOfDigits = numOfDigits;
        list = new ArrayList<Integer>();
        for (int i = 0; i < numOfDigits; i++) {
            list.add(i);
        }
    }

    //    public void writeList(){
//        PrintWriter outWriter = new PrintWriter(new FileWriter("out.txt"));
//        for(int i= 0 ; i<SIZE; i++){
//            outWriter.println("Value at i " + i + " = " + list.get(i));
//        }
//        outWriter.close();
//    }
    public void writeList() throws PrintException {

       FileWriter outWriter = null;
        try {
            outWriter = new FileWriter("out.txt");
            for (int i = 0; i < numOfDigits; i++) {
                outWriter.write("Value at i " + i + " = " + list.get(i));
            }
            outWriter.close();
        } catch (IOException e) {
            //throw new();

        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.toString());//very bad
            e.printStackTrace(System.out);
//            System.exit(1);
        } finally {
            IoUtils.closeWriter(outWriter);
        }


    }

    public static void main(String[] args) throws MalformedURLException {
        ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.init(20);

        try {
            listOfNumbers.writeList();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Second block");
        }
//        catch (PrintException e) {
//            System.out.println("First block");
////            e.printStackTrace();
//        }

//        System.out.println(Arrays.toString(arr));
    }
}
