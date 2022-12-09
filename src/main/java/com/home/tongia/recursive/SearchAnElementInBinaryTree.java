package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

public class SearchAnElementInBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        int searchVal = 5;
        System.out.println(searchAnElementInBinaryTree(root, searchVal));
    }

    private static boolean searchAnElementInBinaryTree(TreeNode root, int searchVal) {
        if(root == null)
            return false;

        boolean isRootVal = root.getVal() == searchVal;
        boolean isInLeftTree = searchAnElementInBinaryTree(root.getLeft(), searchVal);
        boolean isInRightTree = searchAnElementInBinaryTree(root.getRight(), searchVal);

        return isRootVal || isInLeftTree || isInRightTree;

    }


}
