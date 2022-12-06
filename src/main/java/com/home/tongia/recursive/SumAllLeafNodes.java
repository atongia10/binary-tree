package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class SumAllLeafNodes {
    public static void main(String[] args) {
        SampleTree sampleTree = new SampleTree();
        TreeNode root = sampleTree.getSampleTree();

        System.out.println("Sum of all leaf nodes [ " + sumAllLeafNodes(root) +" ]");
    }

    private static int sumAllLeafNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.getLeft() == null && root.getRight() == null) {
            return root.getVal();
        }

        return sumAllLeafNodes(root.getLeft()) + sumAllLeafNodes(root.getRight());
    }


}
