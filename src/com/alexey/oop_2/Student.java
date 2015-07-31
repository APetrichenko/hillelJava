package com.alexey.oop_2;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class Student {
    private int id;
    private String surname; //u novogo studenta zna4eniya budut NULL
    private int[] marks;

    public Student (){
        id = 0;
        surname = "N/A";
        marks = new int[34];
    }
    public Student (int i, String s, int[] m ){      //i = id ; s = surname; m = marks
        id = i;
        surname = s;
        marks = m;
    }

    public Student(int i, String surname) {
        this.id = id;
        this.surname = surname;
        marks = new int[34];
    }

    public Student(Student st) {   //          Konstruktor kopirovania    (st = student kotorogo sozdaem)
        this.id = st.id;
        surname = new String(st.surname);
        // marks = st.marks;
        marks = new int[st.marks.length];
        for (int i=0;i<marks.length;i++){
            marks[i] = st.marks[i];
        }
    }

    public int getId(){   //Getter i Setter eto metodi
        return id;
    }

    public void setId(int id){
       /* if(id>999999){
            System.out.println("Id incorrect");  ///mozhno stavit' uslovie
            id=0;
        } */
        this.id = id;
    }

    public void setId(long id) {
        this.id = (int)id;
    }

    public String getSurname(){  //polu4it' zba4enie
        return surname;
    }

    public void setSurname(String surname){  //otdat' zba4enie
        this.surname = surname;
    }
    public int[] getMarks(){     ////otdat' zba4enie
        return marks;
    }


    public void setMark(int lessonNum, int mark) {
        this.marks[lessonNum] = mark;
    }

    public int getMark(int lessonNum) {
        return this.marks[lessonNum];
    }
    /*
    public void come(){
        System.out.println("Student number " + id + "came");
    }
    public void leave(){
        System.out.println("Good bye!!!");
    }
    */
}
