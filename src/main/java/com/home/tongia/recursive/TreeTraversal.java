package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public static void main(String[] args) {

        TreeNode root = new SampleTree().getSampleTree();

        System.out.print("dfsPreOrder: ");
        dfsPreOrder(root);
        System.out.println();
        System.out.print("dfsInorder: ");
        dfsInorder(root);
        System.out.println();
        System.out.print("dfsPostOrder: ");
        dfsPostOrder(root);
        System.out.println();
        System.out.print("bfsTraversal: ");
        bfsTraversal(root);
    }

    private static void bfsTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.getVal()+" ");
            if (temp.getLeft()!=null){
                queue.add(temp.getLeft());
            }
            if (temp.getRight()!=null){
                queue.add(temp.getRight());
            }
        }
    }

    private static void dfsPreOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.getVal()+" ");
        dfsPreOrder(root.getLeft());
        dfsPreOrder(root.getRight());
    }

    private static void dfsInorder(TreeNode root) {
        if(root == null) {
            return;
        }
        dfsInorder(root.getLeft());
        System.out.print(root.getVal()+" ");
        dfsInorder(root.getRight());
    }

    private static void dfsPostOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        dfsPostOrder(root.getLeft());
        dfsPostOrder(root.getRight());
        System.out.print(root.getVal()+" ");
    }
}
