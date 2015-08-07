package com.alexey.trash;

/**
 * Created by NewClass7 on 07.08.2015.
 */
public class Employee {
    private int id;
    private String name;

    public Employee(String name) {
        this.id = 0;
        this.name = name;
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
