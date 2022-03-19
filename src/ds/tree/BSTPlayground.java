package ds.tree;

public class BSTPlayground {
    public static void main(String[] args) {
        BinarySearchTree tree = constructBST();
        tree.printTree();
        System.out.println();
        tree.invertTree();

    }

    private static BinarySearchTree constructBST() {
        BinarySearchTree tree = new BinarySearchTree();
        /*tree.add(15);
        tree.add(26);
        tree.add(20);
        tree.add(8);
        tree.add(6);*/
        tree.add(3);
        tree.add(1);
        tree.add(7);
        return tree;
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
