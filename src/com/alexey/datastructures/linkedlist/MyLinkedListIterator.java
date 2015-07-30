package com.alexey.datastructures.linkedlist;

import java.util.Iterator;

/**
 * Created by Alexey on 31.07.2015.
 */
public class MyLinkedListIterator implements Iterator<Object> {
    private Element currentElement;
    public MyLinkedListIterator(Element element) {
        this.currentElement = element;
    }

    @Override
    public boolean hasNext() {
        return currentElement!=null;
    }

    @Override
    public Object next() {
        Object toReturn = currentElement.data;
        currentElement = currentElement.next;
        return toReturn;
    }
}
