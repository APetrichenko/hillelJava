package com.alexey.lesson_11.tree;

import java.time.temporal.Temporal;

/**
 * Created by ITHILLEL6 on 24.07.2015.
 */
public class Tree {
    private Node root;    // privatnoe pole koren; tipa Node

    public void add(Object object){
        Node node = new Node(object);
        add(node);

    }

    public void add(Node newNode){
        if(root==null){
            root = newNode;
        }
        add(root, newNode);

    }

    public void add(Node addTo, Node newNode){
        Object addToObj = addTo.getData();
        Object newNodeObj = newNode.getData();

        Comparable addToComparable = (Comparable)addToObj;
        Comparable newNodeComparable = (Comparable)newNodeObj;
        if (addToComparable.compareTo(newNodeComparable)==0){
            return;
        }

       if(addToComparable.compareTo(newNodeComparable)>0){
         if(addTo.getLeft()==null){
               addTo.setLeft(newNode);
           }
           add(addTo.getLeft(), newNode);
       } else if(addToComparable.compareTo(newNodeComparable)<0){
           if(addTo.getRight()==null){
               addTo.setRight(newNode);
           }
           add(addTo.getRight(), newNode);
       }
    }


    @Override
    public String toString() {
        return null;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println(tree);
    }
}

