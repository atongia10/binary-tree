package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class SumAllLeftLeafNodes {

    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();

        System.out.println("Sum of all left leaf nodes  [ " + sumOfAllLeftLeafNodes(root) + " ]");
    }

    private static int sumOfAllLeftLeafNodes(TreeNode root) {
        int sum = 0;
        if(root == null) {
            return 0;
        }

        if (root.getLeft() != null && root.getLeft().getLeft() == null && root.getLeft().getRight()==null) {
            sum+=root.getLeft().getVal();
        } else {
            sum+=sumOfAllLeftLeafNodes(root.getLeft());
        }

        sum+=sumOfAllLeftLeafNodes(root.getRight());

        return sum;
    }
}
