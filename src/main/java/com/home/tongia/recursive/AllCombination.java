package com.home.tongia.recursive;

import com.home.tongia.SampleTree;
import com.home.tongia.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllCombination {

    public static void main(String[] args) {
        TreeNode root = new SampleTree().getSampleTree();
        System.out.println(allCombinations(root));
    }

    private static List<List<String>> allCombinations(TreeNode root) {
        List<List<String>> result = new ArrayList<>();
        List<String> str = new ArrayList<>();
        allCombinations(root, str, result);
        return result;
    }

    private static void allCombinations(TreeNode root, List<String> str, List<List<String>> result) {
        if(root == null) {
            return;
        }
        if(root.getLeft() == null && root.getRight()==null){
            str.add(root.getVal()+"");
            result.add(new ArrayList<>(str));
            return;
        }
        str.add(root.getVal()+"");
        allCombinations(root.getLeft(), str, result);
        str.remove(str.size()-1);
        allCombinations(root.getRight(), str, result);
        str.remove(str.size()-1);
    }

    public static void allCombinationsOptimized(TreeNode root, List<String> str, List<List<String>> result) {
        if (root == null) {
            return;
        }
        str.add(root.getVal() + "");
        if (root.getLeft() == null && root.getRight() == null) {
            result.add(new ArrayList<>(str));
        } else {
            allCombinations(root.getLeft(), str, result);
            allCombinations(root.getRight(), str, result);
        }
        str.remove(str.size() - 1);
    }
}
