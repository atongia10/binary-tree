package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class SizeOfBinaryTree {

    public static void main(String[] args) {

        TreeNode root = new SampleTree().getSampleTree();
        System.out.println("Size of binary tree [ " + sizeOfBinaryTree(root) +" ]");

    }

    private static int sizeOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + sizeOfBinaryTree(root.getLeft()) + sizeOfBinaryTree(root.getRight());

    }

}
