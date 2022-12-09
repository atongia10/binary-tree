package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class MaximumElementInABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        System.out.println(maximumElementInABinaryTree(root));
    }

    private static int maximumElementInABinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int maxOfLeftTree = maximumElementInABinaryTree(root.getLeft());
        int maxOfRightTree = maximumElementInABinaryTree(root.getRight());
        int maxOfLeftAndRightTree = Math.max(maxOfLeftTree, maxOfRightTree);

        return Math.max(root.getVal(), maxOfLeftAndRightTree);



    }



}
