package com.alexey.patterns.factorymethod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by NewClass7 on 11.09.2015.
 */
public class CollectionFactory {
    public static List createList(String type){
        switch (type){
            case "Array":
                return new ArrayList();
            case "Linked":
                return new LinkedList();
        }

        return null; // обавлено для компиляции
    }
}
