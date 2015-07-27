package com.alexey.practice.binarytreee;


public class Traversals {

    public static void main(String[] args) 
    {
        TreeNode parent = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode next = new TreeNode(5);

        parent.insertInOrder(left.data);
        parent.insertInOrder(right.data);
        parent.insertInOrder(next.data);

        System.out.println("Pre-order traversal");
        parent.preOrderTraversal(parent);
        System.out.println();

        System.out.println("Post-order traversal");
        parent.postOrderTraversal(parent);
        System.out.println();

        System.out.println("In-order traversal");
        parent.inOrderTraversal(parent);
        System.out.println();

        System.out.println("min element:"+parent.findMin(parent));
        System.out.println("max element:"+parent.findMax(parent));
    }

}