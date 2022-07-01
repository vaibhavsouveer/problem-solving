package dsa.algo.dp.adityaverma.tree.maxpathsum;

import commons.util.tree.TreeNode;
import commons.util.tree.TreeUtil;
import commons.util.tree.BinarySearchTree;

public class MaxPathSum {
    static int res = Integer.MIN_VALUE;
    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.constructBST();
        TreeUtil.printLevelOrder(bst.root);
        fun(bst.root);
        System.out.println("maxSum = " + res);
    }

    public static int fun(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int l = fun(node.leftChild);
        int r = fun(node.rightChild);

        int temp = Math.max(Math.max(l, r) + node.value, node.value);
        int ans = Math.max(temp, l + r + node.value);

        res = Math.max(res, ans);
        return temp;
    }
}
