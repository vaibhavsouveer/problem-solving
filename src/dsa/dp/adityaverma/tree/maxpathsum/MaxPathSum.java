package dsa.dp.adityaverma.tree.maxpathsum;

import commons.TreeNode;
import dsa.ds.tree.BinarySearchTree;

public class MaxPathSum {
    static int res = Integer.MIN_VALUE;
    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.constructBST();
        int maxSum = fun(bst.root);
        System.out.println("maxSum = " + maxSum);
    }

    public static int fun(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int l = fun(node.leftChild);
        int r = fun(node.rightChild);

        int temp = Math.max(Math.max(l, r) + node.data, node.data);
        int ans = Math.max(temp, l + r + node.data);

        res = Math.max(res, ans);
        return temp;
    }
}
