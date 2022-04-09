package dsa.ds.tree;

import commons.TreeNode;

import java.util.*;

public class BinarySearchTree {
    public TreeNode root;

    BinarySearchTree() { }

    public static BinarySearchTree constructBST() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(15);
        tree.add(-26);
        tree.add(20);
        tree.add(8);
        tree.add(6);
        tree.add(3);
        tree.add(1);
        tree.add(7);
        tree.add(17);
        return tree;
    }

    void add(int data) {
        if(this.root == null) {
            root = new TreeNode(data);
        } else {
            // add node recursively
            addNode(root, data);
        }
    }

    private void addNode(TreeNode node, int data) {
        if(node.data < data) {
            if(node.rightChild != null) {
                addNode(node.rightChild, data);
            } else {
                node.rightChild = new TreeNode(data);
            }
        } else if(node.data > data) {
            if(node.leftChild != null) {
                addNode(node.leftChild, data);
            } else {
                node.leftChild = new TreeNode(data);
            }
        }
    }

    int getHeightOfTree() {
        return getHeight(this.root);
    }

    private int getHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        if(node.leftChild == null && node.rightChild == null) {
            return 1;
        }
        return 1 + Math.max(getHeight(node.leftChild), getHeight(node.rightChild));
    }

    void printTree() {
        Queue queue = new LinkedList();
        queue.add(this.root);
        levelOrderTraversal(queue);
    }

    private void levelOrderTraversal(Queue queue) {
        if(queue.size() != 0) {
            TreeNode node = (TreeNode)queue.remove();
            System.out.print(node.data + " ");
            if(node.leftChild != null) queue.add(node.leftChild);
            if(node.rightChild != null) queue.add(node.rightChild);
            levelOrderTraversal(queue);
        }

    }

    void reverseLevelOrderTraversal() {
        Queue<TreeNode> queue = new LinkedList();
        Stack<TreeNode> stack = new Stack();
        queue.add(this.root);
        reverseLevelOrderTraversal(queue, stack);
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private void reverseLevelOrderTraversal(Queue queue, Stack stack) {
        if(!queue.isEmpty()) {
            TreeNode node = (TreeNode)queue.remove();
            if(node.rightChild != null) queue.add(node.rightChild);
            if(node.leftChild != null) queue.add(node.leftChild);
            stack.push(node);
            reverseLevelOrderTraversal(queue, stack);
        }
    }

    public void inOrderTraversal() {
        inOrder(this.root);
    }

    private void inOrder(TreeNode node) {
        if(node != null) {
            inOrder(node.leftChild);
            System.out.print(node.data + " ");
            inOrder(node.rightChild);
        }
    }

    public void preOrderTraversal() {
        preOrder(this.root);
    }

    private void preOrder(TreeNode node) {
        if(node != null) {
            System.out.print(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public void postOrderTraversal() {
        postOrder(this.root);
    }

    private void postOrder(TreeNode node) {
        if(node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.data + " ");
        }
    }

    int getDiameterOfTree() {
        return treeDiameter(this.root);
    }

    private int treeDiameter(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return Math.max(Math.max(treeDiameter(node.leftChild), treeDiameter(node.rightChild)),
                getHeight(node.leftChild) + getHeight(node.rightChild) + 1);
    }

    void invertTree() {
        invertTree(this.root);
        printTree();
    }
    void invertTree(TreeNode node) {
        if(node != null) {
            invertTree(node.leftChild);
            invertTree(node.rightChild);
            TreeNode temp = node.leftChild;
            node.leftChild = node.rightChild;
            node.rightChild = temp;
        }
    }

}
