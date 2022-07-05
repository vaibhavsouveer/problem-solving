package dsa.ds.tree;

import commons.util.tree.TreeNode;
import commons.util.tree.TreeUtil;

public class PrintLeavesOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = TreeUtil.constructBinaryTree();
        printLeaves(root);
    }

    private static void printLeaves(TreeNode node) {
        if(node.leftChild == null && node.rightChild == null) {
            System.out.print(node.value + " ");
            return;
        }
        if(node.leftChild != null) {
            printLeaves(node.leftChild);
        }
        if(node.rightChild != null) {
            printLeaves(node.rightChild);
        }
    }
}


