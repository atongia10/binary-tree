package com.home.tongia.recursive;

import com.home.tongia.TreeNode;

public class _100SameTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode aNode1 = new TreeNode(2);
        TreeNode bNode1 = new TreeNode(3);
        root1.setLeft(aNode1);
        root1.setRight(bNode1);

        TreeNode root2 = new TreeNode(1);
        TreeNode aNode2 = new TreeNode(2);
        TreeNode bNode2 = new TreeNode(3);
        root2.setLeft(aNode2);
        root2.setRight(bNode2);

        System.out.println("Is Same Tree : " + isSameTree(root1, root2));
    }

    private static boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2== null) {
            return false;
        }

        return root1.getVal() == root2.getVal() &&
                isSameTree(root1.getLeft(), root2.getLeft()) &&
                    isSameTree(root1.getRight(), root2.getRight());

    }
}
