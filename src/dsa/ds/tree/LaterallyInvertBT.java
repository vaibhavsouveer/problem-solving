package dsa.ds.tree;

import commons.util.tree.TreeNode;

import static commons.util.tree.TreeUtil.constructBinaryTree;
import static commons.util.tree.TreeUtil.printLevelOrder;

public class LaterallyInvertBT {
    public static void main(String[] args) {
        TreeNode root = constructBinaryTree();
        invert(root);
        printLevelOrder(root);
    }

    private static void invert(TreeNode node) {
        if(node != null) {
            invert(node.leftChild);
            invert(node.rightChild);
            swap(node);
        }
    }

    private static void swap(TreeNode node) {
        TreeNode temp = node.leftChild;
        node.leftChild = node.rightChild;
        node.rightChild = temp;
    }
}
