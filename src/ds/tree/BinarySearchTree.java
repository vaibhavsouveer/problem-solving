package ds.tree;

import java.util.*;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() { }

    BinarySearchTree(Node node) {
        this.root = node;
    }

    void add(int data) {
        if(this.root == null) {
            root = new Node(data);
        } else {
            // add node recursively
            addNode(root, data);
        }
    }

    private void addNode(Node node, int data) {
        if(node.data < data) {
            if(node.rightChild != null) {
                addNode(node.rightChild, data);
            } else {
                node.rightChild = new Node(data);
            }
        } else if(node.data > data) {
            if(node.leftChild != null) {
                addNode(node.leftChild, data);
            } else {
                node.leftChild = new Node(data);
            }
        }
    }

    int getHeightOfTree() {
        return getHeight(this.root);
    }

    private int getHeight(Node node) {
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
            Node node = (Node)queue.remove();
            System.out.print(node.data + " ");
            if(node.leftChild != null) queue.add(node.leftChild);
            if(node.rightChild != null) queue.add(node.rightChild);
            levelOrderTraversal(queue);
        }

    }

    void reverseLevelOrderTraversal() {
        Queue<Node> queue = new LinkedList();
        Stack<Node> stack = new Stack();
        queue.add(this.root);
        reverseLevelOrderTraversal(queue, stack);
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private void reverseLevelOrderTraversal(Queue queue, Stack stack) {
        if(!queue.isEmpty()) {
            Node node = (Node)queue.remove();
            if(node.rightChild != null) queue.add(node.rightChild);
            if(node.leftChild != null) queue.add(node.leftChild);
            stack.push(node);
            reverseLevelOrderTraversal(queue, stack);
        }
    }

    public void inOrderTraversal() {
        inOrder(this.root);
    }

    private void inOrder(Node node) {
        if(node != null) {
            inOrder(node.leftChild);
            System.out.print(node.data + " ");
            inOrder(node.rightChild);
        }
    }

    public void preOrderTraversal() {
        preOrder(this.root);
    }

    private void preOrder(Node node) {
        if(node != null) {
            System.out.print(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public void postOrderTraversal() {
        postOrder(this.root);
    }

    private void postOrder(Node node) {
        if(node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.data + " ");
        }
    }

    int getDiameterOfTree() {
        return treeDiameter(this.root);
    }

    private int treeDiameter(Node node) {
        if(node == null) {
            return 0;
        }
        return Math.max(Math.max(treeDiameter(node.leftChild), treeDiameter(node.rightChild)), getHeight(node.leftChild) + getHeight(node.rightChild) + 1);
    }

}
