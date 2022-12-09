package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _257BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        List<String> result = new ArrayList<>();
        result = binaryTreePaths(root, result);
        System.out.println(result);
    }

    private static List<String> binaryTreePaths(TreeNode root, List<String> result) {

        String str = "";
        binaryTreePaths(root, result, str);
        return result;
    }

    private static void binaryTreePaths(TreeNode root, List<String> result, String str) {
        if(root == null) {
            return;
        }

        if(root.getRight()==null && root.getLeft()==null) {
            result.add(str+root.getVal());
        }

        binaryTreePaths(root.getLeft(), result, str+root.getVal()+"->");
        binaryTreePaths(root.getRight(), result, str+root.getVal()+"->");

    }


}
