package com.alexey.trash;

/**
 * Created by NewClass7 on 07.08.2015.
 */
public class Test {

    public static void changeName1(Employee employee) {
        employee = new Employee("Ivan") ;
    }
    public static void changeName2(Employee employee) {
        employee.setName("Ivan");
    }

    public static void main(String[] args) {
        Employee employee = new Employee(100, "Peter");
        changeName1(employee);
        System.out.println(employee.getId() + " " + employee.getName());

        changeName2(employee);
        System.out.println(employee.getId() + " " + employee.getName());
    }
}
