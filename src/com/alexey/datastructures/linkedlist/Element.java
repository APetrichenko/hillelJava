package com.alexey.datastructures.linkedlist;

/**
 * Created by Alexey on 31.07.2015.
 */
public class Element {
    Element next;
    Object data;

    public Element(Element next, Object data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        return data.equals(((Element)obj).data);
    }
}
