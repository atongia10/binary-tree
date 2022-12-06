package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class SumAllNodesOfTree {

    public static void main(String[] args) {
        SampleTree sampleTree = new SampleTree();
        TreeNode root = sampleTree.getSampleTree();

        System.out.println("Sum of all nodes [ " + sumAllNodesOfTree(root) +" ]");
    }

    public static int sumAllNodesOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return root.getVal() + sumAllNodesOfTree(root.getLeft()) + sumAllNodesOfTree(root.getRight());
    }

}
