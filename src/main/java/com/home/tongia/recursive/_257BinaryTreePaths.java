/*
package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _257BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        List<String> result = new ArrayList<>();
        result = binaryTreePaths(root);
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<List<String>> finalResult = new ArrayList<>();
        binaryTreePaths(root, result, finalResult);
        System.out.println(result);
        System.out.println(finalResult);
        return result;

    }

    private static void binaryTreePaths(TreeNode root, List<String> result, List<List<String>> finalResult) {
        if(root == null)
            return;
        if(root.getRight() == null && root.getLeft() ==null) {
            result.add(root.getVal()+"");
            finalResult.add(new ArrayList<>(result));
        }
        result.add(root.getVal()+"");
        binaryTreePaths(root.getLeft(), result, finalResult);
        result.remove(result.size()-1);
        binaryTreePaths(root.getRight(), result, finalResult);
    }
}
*/
