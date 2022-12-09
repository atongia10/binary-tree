package com.home.tongia.iterative;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {
    public static void main(String[] args) {

        TreeNode root = new SampleTree().getSampleTree();
        System.out.println("Size of binary tree [ " + sizeOfBinaryTree(root) +" ]");

    }

    private static int sizeOfBinaryTree(TreeNode root) {
        int size = 0;
        if(root == null) {
            return size;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            size++;
            if(tmp.getLeft()!=null) {
                queue.add(tmp.getLeft());
            }
            if (tmp.getRight()!=null) {
                queue.add(tmp.getRight());
            }
        }

        return size;
    }

}
