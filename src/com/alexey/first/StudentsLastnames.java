package com.alexey.first;

import java.util.Scanner;
/**
 * Created by Alexey on 6/30/15.
 */
public class StudentsLastnames {
    public static void main(String[] args) {

       // String [] students = {"Smith","Johnson","Williams","White","Griffin","Adams","Scott","Black"};
        String [] students = {"Smith","Johnson","Williams","White","Griffin","Adams","Scott","Black"};

        System.out.println(students.length);

        students = expandArray(students, 1);
        students[8] = "New Student";

        System.out.println(students[8]);
        System.out.println(students.length);

        for (int i = 0;i < students.length;i++){  //показывает сожержание вего массива
            System.out.println(students[i]);
        }


    }

        public static String[] expandArray(String[] inArray, int expandBy) {
        int initLength = inArray.length;
        String[] result = new String[initLength+expandBy];
        for (int i = 0; i <inArray.length;i++){
            result[i] = inArray[i];
        }
        return result;
    }
    public String[] addStudent(String[] students, String newSt){
        students = expandArray(students, 1);
        students[students.length-1] = newSt;
        return students;
    }
    public String[] remove(String[] students,String surname){
        String[] result = new String[students.length];
        int j=0;
        for (int i=0;i<students.length;i++){
            if (!students[i].equals(surname)){
                result[j] = students[i];
                j++;
            }
        }



        return result;

    }


}

