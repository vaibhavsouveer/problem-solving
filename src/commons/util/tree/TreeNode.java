package commons.util.tree;

public class TreeNode {

    public int value;
    public static int n = 0;
    public TreeNode leftChild, rightChild;

    public TreeNode(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}
