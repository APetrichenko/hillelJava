package com.alexey.tdd.testing.unittest;

import com.alexey.tdd.testing.SimpleArrayList;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NewClass7 on 22.09.2015.
 */
public class SimpleArrayListTest {

    SimpleArrayList arrayList;

    @Before
    public void setUp() {
        System.out.println("B1");
        arrayList = new SimpleArrayList();
    }

    @Before
    public void setUp2() {
        System.out.println("B2");
        arrayList = new SimpleArrayList();
    }

    @Test
    public void additionTest(){
//        SimpleArrayList arrayList = new SimpleArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        assertEquals(4, arrayList.size());
    }

    @Test
    public void isEmptyTest (){
//        SimpleArrayList arrayList = new SimpleArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add(1);
        assertFalse(arrayList.isEmpty());

    }

    @After
    public void tearDown(){
        System.out.println("Complete");
    }



}

