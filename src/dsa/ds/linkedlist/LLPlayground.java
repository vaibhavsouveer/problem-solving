package dsa.ds.linkedlist;

public class LLPlayground {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.printListRecursive();
        list.reversePartOfLL(2, 4);
        list.printListRecursive();
    }
}
