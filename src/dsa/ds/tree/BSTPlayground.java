package dsa.ds.tree;

public class BSTPlayground {
    public static void main(String[] args) {
        BinarySearchTree tree = BinarySearchTree.constructBST();
        tree.printTree();
        System.out.println();
        tree.invertTree();

    }


}



/*
        System.out.println("HeightOfTree = " + tree.getHeightOfTree());
        tree.inOrderTraversal();
        System.out.println();
        tree.preOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();

        tree.reverseLevelOrderTraversal();
 */
