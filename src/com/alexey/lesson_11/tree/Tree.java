package com.alexey.lesson_11.tree;

import java.time.temporal.Temporal;

/**
 * Created by ITHILLEL6 on 24.07.2015.
 */
public class Tree {
    private Node root;    // privatnoe pole koren; tipa Node
    private int min;
    private int max;


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
//        if(addToComparable.compareTo(newNodeComparable)==0){     /// ne nuzhno
//            return;
//        }

       if(addToComparable.compareTo(newNodeComparable)>0){
         if(addTo.getLeft()==null){
               addTo.setLeft(newNode);
           } else {
             add(addTo.getLeft(), newNode);
         }
       } else if(addToComparable.compareTo(newNodeComparable)<0){
           if(addTo.getRight()==null){
               addTo.setRight(newNode);
           } else {
               add(addTo.getRight(), newNode);
           }
       }
    }
    public Object getMin() {
        return (getMin(root));
    }

    public Object getMin(Node node){
        Node current = node;
        if (current != null) {
            while (current.left != null) {
                current = current.left;
            }

            return (current.data);
        }else{
           return null;
        }

}



    public Object getMax(Node node){
        Node current = node;
        if (current != null) {
            while (current.right != null) {
                current = current.right;
            }

            return (current.data);
        } else {
            return null;
        }

    }





    @Override
    public String toString() {
        return null;
    }

    //TODO
//    getMin();

    public static void main(String[] args) {
        Tree tree = new Tree();
    //    Tree.Node node = new Tree.Node(1); ///tak sozdautsya esli class static
    //    tree.new Node(1);  //tak sozdautsya vlozhannie objecti classov
    //    tree.new Node(2);


        tree.add(77);
        tree.add(45);
        tree.add(65);
        System.out.println(tree);
        tree.getMin();
        System.out.println(tree);
    }


 // NESTED class  - vlozhenniy class
    public static class Node {
        private Object data;
        private Node left;
        private Node right;

        public Node(Object data) {
            this.data = data;

        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Object getData() {
            return data;
        }
    }
}

