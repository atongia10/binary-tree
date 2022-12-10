package com.home.tongia.iterative;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeavesInTheBinaryTree {
    public static void main(String[] args) {

        TreeNode root = new SampleTree().getSampleTree();
        System.out.println("Number of leaves in a binary tree [ " + numberOfLeavesInTheBinaryTree(root) +" ]");
        System.out.println("Number of full nodes in a binary tree [ " + numberFullNodesInTheBinaryTree(root) +" ]");

    }

    private static int numberOfLeavesInTheBinaryTree(TreeNode root) {
        int num = 0;
        if(root == null) {
            return num;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if(tmp.getLeft()==null && tmp.getRight()==null){
                num++;
            }
            if(tmp.getLeft()!=null) {
                queue.add(tmp.getLeft());
            }
            if(tmp.getRight()!=null) {
                queue.add(tmp.getRight());
            }
        }
        return num;
    }

    private static int numberFullNodesInTheBinaryTree(TreeNode root) {
        int num = 0;
        if(root == null) {
            return num;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if(tmp.getLeft()!=null && tmp.getRight()!=null){
                num++;
            }
            if(tmp.getLeft()!=null) {
                queue.add(tmp.getLeft());
            }
            if(tmp.getRight()!=null) {
                queue.add(tmp.getRight());
            }
        }
        return num;
    }
}
