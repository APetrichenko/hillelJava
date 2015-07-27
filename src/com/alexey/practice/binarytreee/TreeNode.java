package com.alexey.practice.binarytreee;

/**
 * Created by Alexey on 27.07.2015.
 */


public class TreeNode
{
    TreeNode left;
    TreeNode right;
    int data;
    TreeNode parent;
    int size=0;

    TreeNode(int data)
    {
        this.data = data;
        size = 1;
    }

    int size()
    {
        return size;
    }

    void setLeftChild(TreeNode left)
    {
        this.left = left;
        if(left == null)
        {
            left.parent = this;
        }
    }

    void setRightChild(TreeNode right)
    {
        this.right = right;
        if(right == null)
        {
            right.parent =  this;
        }
    }

    void insertInOrder(int d)
    {
        if(d <= data)
        {
            if(left == null)
            {
                setLeftChild(new TreeNode(d));
            }
            else
            {
                left.insertInOrder(d);
            }
        }
        else{
            if(right == null)
            {
                setRightChild(new TreeNode(d));
            }
            else{
                right.insertInOrder(d);
            }
        }
        size++;
    }

    void postOrderTraversal(TreeNode parent)
    {
        if(parent == null) return;

        postOrderTraversal(parent.left);
        postOrderTraversal(parent.right);
        printVal(parent);
    }

    void preOrderTraversal(TreeNode parent)
    {
        if(parent == null) return;

        printVal(parent);
        preOrderTraversal(parent.left);
        preOrderTraversal(parent.right);
    }

    void inOrderTraversal(TreeNode parent)
    {
        if(parent == null) return;

        inOrderTraversal(parent.left);
        printVal(parent);
        inOrderTraversal(parent.right);
    }

    void printVal(TreeNode parent)
    {
        System.out.print(parent.data + "\t");
    }

    /* binary tree find Minimum */
    int findMin(TreeNode parent)
    {
        if(parent == null) return 0;

        int min = parent.data;
        if(parent.left !=null)
        {
            min = Math.min(min, findMin(parent.left));
        }

        if(parent.right != null)
        {
            min = Math.min(min, findMin(parent.right));
        }

        return min;
    }

    /* binary tree find Maximum */
    int findMax(TreeNode parent)
    {
        if(parent == null) return 0;

        int max = parent.data;
        if(parent.left !=null)
        {
            max = Math.max(max, findMax(parent.left));
        }
        if(parent.right != null)
        {
            max = Math.max(max, findMax(parent.right));
        }
        return max;
    }
}
