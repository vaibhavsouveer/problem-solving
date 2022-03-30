package commons;

public class TreeNode {

    public int data;
    public static int n = 0;
    public TreeNode leftChild, rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public String toString() {
        return Integer.toString(data);
    }
}
