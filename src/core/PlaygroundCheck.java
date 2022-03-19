package core;

public class PlaygroundCheck {
    public static void main(String[] args) {
        Integer node = 3;
        Integer leftChild = 1;
        Integer rightChild = 7;
        System.out.println("leftChild = " + leftChild);
        System.out.println("rightChild = " + rightChild);
        Integer temp = leftChild;
        leftChild = rightChild;
        rightChild = temp;
        System.out.println("after swap");
        System.out.println("leftChild = " + leftChild);
        System.out.println("rightChild = " + rightChild);
    }
}
