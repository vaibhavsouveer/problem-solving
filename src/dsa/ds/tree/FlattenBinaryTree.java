package dsa.ds.tree;

import commons.util.tree.TreeNode;

import static commons.util.tree.TreeUtil.constructBinaryTree;
import static commons.util.tree.TreeUtil.printLevelOrder;

/*
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNode root = (constructBinaryTree());
        flatten(root);
        printLevelOrder(root);

    }

    private static void flatten(TreeNode node) {
        if(node != null) {
            flatten(node.leftChild);
            flatten(node.rightChild);
            TreeNode tempRight = node.rightChild;
            node.rightChild = node.leftChild;
            node.leftChild = null;
            TreeNode rightEnd = node;
            while(rightEnd.rightChild != null) {
                rightEnd = rightEnd.rightChild;
            }
            rightEnd.rightChild = tempRight;
        }
    }
}
