package com.alexey.tdd.testing.unittest;

import com.alexey.tdd.testing.SimpleArrayList;


import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by NewClass7 on 22.09.2015.
 */
public class SimpleArrayListTest {

    SimpleArrayList arrayList;

    @BeforeClass
    public static void setUpAll(){
        System.out.println("Set up all");
    }

    @Before
    public void setUp() {
        System.out.println("B1");
        arrayList = new SimpleArrayList();
    }

//    @Before
//    public void setUp2() {
//        System.out.println("B2");
//        arrayList = new SimpleArrayList();
//    }

    @Test
    public void additionTest(){
//        SimpleArrayList arrayList = new SimpleArrayList();  //вметсо того чтобы объе€л€ть в каждом тесте можно объ€вить д€л всех как сделано выше
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        assertEquals(4, arrayList.size());
    }

    @Ignore  // Ignore this test  (ставитс€ если хотим пропустить этот тест)
    @Test
    public void isEmptyTest (){
//        SimpleArrayList arrayList = new SimpleArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add(1);
        assertFalse(arrayList.isEmpty());
    }

//    @Test(expected = IndexOutOfBoundsException.class)
//    public void nullAdditionTest (){
//
//        arrayList.add(-1);
//
//    }

    @After
    public void tearDown(){
        System.out.println("Complete");
    }

    @AfterClass
    public static void tearDownAll(){
        System.out.println("Complete All");
    }



}

