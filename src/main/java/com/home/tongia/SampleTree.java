package com.home.tongia;

public class SampleTree {

    public TreeNode getSampleTree(){

        TreeNode root = new TreeNode(1);
        TreeNode bNode = new TreeNode(2);
        TreeNode cNode = new TreeNode(3);
        TreeNode dNode = new TreeNode(4);
        TreeNode eNode = new TreeNode(5);
        TreeNode fNode = new TreeNode(6);
        TreeNode gNode = new TreeNode(7);

        root.setLeft(bNode);
        root.setRight(cNode);

        bNode.setLeft(dNode);
        bNode.setRight(eNode);

        cNode.setLeft(fNode);
        cNode.setRight(gNode);

        return root;
    }
}
