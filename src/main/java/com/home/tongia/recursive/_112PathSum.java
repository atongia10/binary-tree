package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class _112PathSum {
    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        int targetSum = 10;
        System.out.println(hasPathSum(root, targetSum));

    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }

        if(root.getVal()==targetSum && root.getLeft() == null && root.getRight() == null) {
            return true;
        }

        return hasPathSum(root.getLeft(), targetSum - root.getVal())
                ||
                hasPathSum(root.getRight(), targetSum - root.getVal());

    }

}
