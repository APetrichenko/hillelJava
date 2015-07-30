package com.alexey.datastructures.tree;

/**
 * Created by Alexey on 31.07.2015.
 */
public class Node {
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
