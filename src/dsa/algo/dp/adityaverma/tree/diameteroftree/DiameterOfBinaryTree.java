package dsa.algo.dp.adityaverma.tree.diameteroftree;

import commons.util.tree.TreeNode;
import commons.util.tree.TreeUtil;

public class DiameterOfBinaryTree {
    static int res = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode root = TreeUtil.constructBinaryTree();
        treeDiameter(root);
        System.out.println("Diameter of tree = " + res);
    }

    private static int treeDiameter(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left = treeDiameter(node.leftChild);
        int right = treeDiameter(node.rightChild);

        int temp = Math.max(left, right) + 1;
        int ans = Math.max(temp, left + right + 1);
        res = Math.max(res, ans);
        return temp;
    }
}
