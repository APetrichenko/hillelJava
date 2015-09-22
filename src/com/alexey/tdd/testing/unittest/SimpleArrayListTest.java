package com.alexey.tdd.testing.unittest;

import com.alexey.tdd.testing.SimpleArrayList;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NewClass7 on 22.09.2015.
 */
public class SimpleArrayListTest {

    @Test
    public void additionTest(){
        SimpleArrayList arrayList = new SimpleArrayList();
        arrayList.add(1);

       assertEquals(1, arrayList.size());
    }

}

