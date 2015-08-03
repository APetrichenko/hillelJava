package com.alexey.lesson_12.hashtable;

import com.alexey.oop_students.Student;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by ITHILLEL6 on 28.07.2015.
 */
public class HashTable {
    private static final int DEFAULT_TABLE_SIZE = 10;
    private LinkedList[] table = new LinkedList[DEFAULT_TABLE_SIZE];
    public void put(Student key, Object value){
//        int index = convert(key)%10;     //preorazovivaem dlinniy string(naprimer familiya) v 4islo do 10;
//
//        table[index] = value;
//    }
//
//    private int convert(String name){
//        return name.length();
//    }

        int index = key.hashCode()%DEFAULT_TABLE_SIZE;          //delaem to zhe samoe no uzhe s pomoshu HashCode

        LinkedList linkedList = table[index];
        if(linkedList==null){
            linkedList = new LinkedList();
        }
        Entry entryToAdd = new Entry(key, value);
        if(!linkedList.contains(entryToAdd))
            linkedList.add(new Entry(key, value));
                 table[index]=linkedList;
    }

    public Object get (Object key){
        int index = Math.abs(key.hashCode()%DEFAULT_TABLE_SIZE);
        LinkedList list = table[index];
        if(list==null) return null;
        for(Object entryFromList : list){
            Entry entry = (Entry)entryFromList;
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public  static class Entry{

        private Object key;
        private Object value;
        public Entry(Object key, Object value){
            this.key = key;
            this.value = value;
        }
        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }


    }

    @Override
    public String toString() {
        return "HashTable{" +
                "table=" + Arrays.toString(table) +
                '}';
    }

    public static void main(String[] args) {
        Student ivanov = new Student (2, "Ivanov", new int[]{5, 4});
        HashTable table = new HashTable();
        //table.put(ivanov, 100);


        System.out.println(table);
        //ivanov.getMarks()[0]=2;

        System.out.println(ivanov.hashCode());

        int gotFromTable = (Integer)table.get(ivanov);
        System.out.println(gotFromTable);
        //table.put(ivanov, 100);
        System.out.println(table);

    }

// TODO Doma po4itat' "ataka dney rozhdeniy" (pro rasheshirovanie)

}

