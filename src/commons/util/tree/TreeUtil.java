package commons.util.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeUtil {

    public static TreeNode constructBinaryTree() {
        TreeNode root = new TreeNode(1);
        addSequentially(root, 2);
        addSequentially(root, 3);
        addSequentially(root, 4);
        addSequentially(root, 5);
        addSequentially(root, 6);
        addSequentially(root, 7);
        printLevelOrder(root);
        System.out.println();
        return root;

    }

    public static void printLevelOrder(TreeNode node) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        printLevel(queue);
        System.out.println();
    }

    private static void printLevel(Deque<TreeNode> queue) {
        while(!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            System.out.print(node.value + " ");
            if(node.leftChild != null) {
                queue.offerLast(node.leftChild);
            }
            if(node.rightChild != null) {
                queue.offerLast(node.rightChild);
            }
            printLevel(queue);
        }
    }

    private static void addSequentially(TreeNode node, int val) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offerLast(node);
        addSequentially(queue, val);
    }

    private static boolean addSequentially(Deque<TreeNode> queue, int val) {
        if(queue.isEmpty()) {
            return false;
        }
        TreeNode node = queue.pollFirst();
        if(node.leftChild == null) {
            node.leftChild = new TreeNode(val);
            return true;
        } else if(node.rightChild == null) {
            node.rightChild = new TreeNode(val);
            return true;
        }
        queue.offerLast(node.leftChild);
        queue.offerLast(node.rightChild);
        return addSequentially(queue, val);
    }



}
