package dsa.algo.dp.adityaverma.tree.maxpathsumofleafnodes;

import commons.util.tree.BinarySearchTree;
import commons.util.tree.TreeNode;
import commons.util.tree.TreeUtil;

public class MaxPathSumForLeafNodes {
    static int res = Integer.MIN_VALUE;
    public static void main(String[] args) {
        BinarySearchTree bst = BinarySearchTree.constructBST();
        TreeUtil.printLevelOrder(bst.root);
        maxPathSumForLeafNodes(bst.root);
        System.out.println("maxSum leaf nodes = " + res);
    }

    public static int maxPathSumForLeafNodes(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int l = maxPathSumForLeafNodes(node.leftChild);
        int r = maxPathSumForLeafNodes(node.rightChild);

        int temp = Math.max(l, r) + node.value;
        int ans = Math.max(temp, l + r + node.value);
        res = Math.max(res, ans);
        return temp;
    }
}
