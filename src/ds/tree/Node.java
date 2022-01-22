package ds.tree;

public class Node {

    int data;
    static int n = 0;
    Node parent, leftChild, rightChild;
    int[] inOrder = {7, 12, 15, 16, 17, 20, 25, 27, 29, 120};
    int[] preOrder = {17, 12, 7, 15, 16, 29, 20, 25, 27, 120};
    public Node() {}
    public String toString() {
        return Integer.toString(data);
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getParent() {
        return parent;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }
    public Node getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public Node getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    public void addNode(int x) {
        //insert in right subtree
        if(x > this.getData()) {
            //right child is present
            if(this.getRightChild() != null) {
                //recursive call on right child
                this.getRightChild().addNode(x);
            }
            //right child not present
            else {
                //create new Node and make right child point it
                this.setRightChild(new Node(x));
                //make new node's parent point to this
                this.getRightChild().setParent(this);
            }
        }
        //insert in left subtree
        if(x < this.getData()) {
            //left child present
            if(this.getLeftChild() != null) {
                //recursive call on left child
                this.getLeftChild().addNode(x);
            }
            //left child not present
            else {
                //create new Node and make left child point it
                this.setLeftChild(new Node(x));
                //make new node's parent point to this
                this.getLeftChild().setParent(this);
            }
        }
    }
    public Node(int data) {
        super();
        n++;
        this.data = data;
    }
    public void deleteNode(int x) {

    }
    public void numberOfNodes() {
        System.out.println("Number of nodes = " + n);
    }
    public void inOrder() {
        //if left child is not null
        if(this.getLeftChild() != null) {
            //recursive call on left child
            this.getLeftChild().inOrder();
        }
        System.out.print(this.getData() + " ");
        //if right child in not null
        if(this.getRightChild() != null)
            //recursive call on right child
            this.getRightChild().inOrder();
    }
    public void preOrder() {
        System.out.print(this.getData() + " ");
        //if left child is not null
        if(this.getLeftChild() != null) {
            //recursive call on left child
            this.getLeftChild().preOrder();
        }
        //if right child is not null
        if(this.getRightChild() != null)
            //recursive call on right child
            this.getRightChild().preOrder();
    }
    public void postOrder() {
        //if left child is not null
        if(this.getLeftChild() != null)
            //recursive call on left child
            this.getLeftChild().postOrder();
        //if right child is not null
        if(this.getRightChild() != null)
            //recursive call on right child
            this.getRightChild().postOrder();
        System.out.print(this.getData() + " ");
    }
    public Node predecessor() {
        //search in left sub tree
        if(this.getLeftChild() != null) {
            Node temp = this.getLeftChild();
            //travel down till the last right child
            while(temp.getRightChild() != null) {
                temp = temp.getRightChild();
            }
            //print the last right child
            return temp;
        }
        //left sub tree not present so return parent
        else if(this.getParent() != null)
            return this.getParent();
        //both above condition fails means node is root without
        //left child, so no predecessor - return node itself
        return this;
    }
    public void getNodeInfo() {
        System.out.print("Data: " + this.getData() + "| LeftChild: " + this.getLeftChild() + "| RightChild: " + this.getRightChild() +
                "| Parent: " + this.getParent());
        System.out.println();
    }
    public Node search(int x) {
        //if element to search is at current node
        if(this.getData() == x)
            return this;
            //search in left sub tree
        else if(x < this.getData()) {
            //if left child is present
            if(this.getLeftChild() != null)
                this.getLeftChild().search(x);
            //left child null means x is not present
            return null;
        }
        else {
            //if right child is present
            if(this.getRightChild() != null)
                return this.getRightChild().search(x);
            //right child null means x is not present
            return null;
        }
    }

}
