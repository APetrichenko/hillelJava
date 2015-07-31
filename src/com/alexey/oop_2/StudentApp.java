package com.alexey.oop_2;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class StudentApp {
    public static void main(String[] args) {
        int [] marks = new int[10];

        Student student1 = new Student(0, "Ivanov" );
        Student student2 = new Student(1, "Petrov");
        student1.setMark(2,5);
        student2.setMark(6, 4);

        // System.out.println(student1.getId());
        // System.out.println(student1.getSurname());
        //System.out.println(student1.getMark(2));

     /*
        System.out.println(student2.id);
        System.out.println(student2.surname);
        System.out.println(student2.marks);
    */

        Group group = new Group();
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent("Sidorov");
        group.print();


    }

}
