package com.home.tongia.iterative;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.Stack;

public class MaximumElementInABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        System.out.println(maximumElementInABinaryTree(root));
    }

    private static int maximumElementInABinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int maxVal = Integer.MIN_VALUE;

        while (!stack.isEmpty()){
            TreeNode tmp = stack.pop();
            maxVal = Math.max(tmp.getVal(), maxVal);
            if(tmp.getLeft()!=null) {
                stack.push(tmp.getLeft());
            }
            if(tmp.getRight()!=null) {
                stack.push(tmp.getRight());
            }
        }
        return maxVal;
    }


}
