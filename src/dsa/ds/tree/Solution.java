package dsa.ds.tree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;



public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        //6.52
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        return levelOrderTraversal(queue, result, 0);
    }
    
    private List<List<Integer>> levelOrderTraversal(Deque<TreeNode> queue, List<List<Integer>> result, int level) {
        if(queue.isEmpty()) {
            return result;
        }
        // result.get(level).addAll(queue);
        List<Integer> currentLevelNodes = new ArrayList<>();
        Deque<TreeNode> childNodes = new ArrayDeque<>();
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.pollFirst();
            currentLevelNodes.add(currentNode.val);
            if(currentNode.left != null) {
                childNodes.offerLast(currentNode.left);
            }
            if(currentNode.right != null) {
                childNodes.offerLast(currentNode.right);
            }
        }
        if(!childNodes.isEmpty()) {
                queue.addAll(childNodes);
        }
        if(!currentLevelNodes.isEmpty()) {
            result.get(level).addAll(currentLevelNodes);
        }
        
        return levelOrderTraversal(queue, result, level+1);
    }
}