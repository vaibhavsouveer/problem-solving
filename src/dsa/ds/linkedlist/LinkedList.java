package dsa.ds.linkedlist;

public class LinkedList {
    Node start;

    public LinkedList() {
        start = null;
    }

    private boolean isEmpty() {
        return start == null;
    }

    public void printList() {
        if(isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = start;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void printListRecursive() {
        if(isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        printRec(start);
        System.out.println();
    }

    private void printRec(Node temp) {
        if(temp != null) {
            System.out.print(temp.data + " --> ");
            printRec(temp.next);
            return;
        }
        System.out.print("END");
    }

    /*
    This method is used to insert the first element in .
    Will be called from many operations after checking isEmpty.
     */
    public void insertFirstNode(int value) {
        Node node = new Node(value);
        start = node;
        node.next = null;
    }

    public void insertAtHead(int value) {
        if(this.isEmpty()) {
            insertFirstNode(value);
            return;
        }
        Node node = new Node(value);
        node.next = start;
        start = node;

    }

    public void insert(int value) {
        if(this.isEmpty()) {
            insertFirstNode(value);
            return;
        }
        Node node = new Node(value);
        node.next = null;
        Node temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insertRecursive(int value) {
        if(this.isEmpty()) {
            insertFirstNode(value);
            return;
        }
        insertRec(start, value);

    }

    private void insertRec(Node temp, int value) {
        if(temp.next == null) {
            Node node = new Node(value);
            temp.next = node;
            node.next = null;
        } else {
            insertRec(temp.next, value);
        }
    }

    /*
    Index is starting from 0
     */
    public void insertAtIndex(int index, int value) {
        if(index < 0) {
            System.out.println("Index is -ve! Inserting at 0 index.");
            insertAtHead(value);
            return;
        }
        if(isEmpty()) {
            System.out.println("List is empty! Inserting first element.");
            insertFirstNode(value);
            return;
        }
        if(index == 0) {
            insertAtHead(value);
            return;
        }
        Node node = new Node(value);
        int i = 0;
        Node temp = start;
        while(i + 1 < index && temp.next != null) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    /*
    Delete first occurrence node with data equal to given value.
     */
    public void delete(int value) {

    }

    /*
    Delete node at index.
     */
    public void deleteAtIndex(int index) {

    }

    public void reverseLLRecursive() {
        reverseRec(this.start);
    }

    private Node reverseRec(Node node) {
        if(node.next == null) {
            start = node;
            return node;
        }
        Node temp = reverseRec(node.next);
        temp.next = node;
        node.next = null;
        return node;
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = start;
        Node next = curr.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
            start = prev;
        }
    }

    /*
    max value of both index will be size of list
    min value will be 1
    min < max
     */
    public void reversePartOfLL(int leftIndex, int rightIndex) {
        int i = 1;
        // first we write loop to get two pointers to leftIndex - 1 and rightIndex + 1
        Node left = start;
        Node right = start;
        while(i <= rightIndex) {
            if(i < leftIndex - 1) {
                left = left.next;
            }
            if(right.next != null) {
                right = right.next;
            }
            i++;
        }
        boolean isRightIndexAtEnd = right.next == null;
        System.out.println("left.data = " + left.data);
        System.out.println("right.data = " + right.data);
        Node curr = start;
        Node prev = null;
        i = 1;
        while( i != leftIndex) {
            curr = curr.next;
            i++;
        }
        System.out.println("curr.data = " + curr.data);
        Node next = curr.next;
        // now the three pointers are in position, start reversing
        i = leftIndex;
        while(i <= rightIndex) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
            i++;
        }
        // condition to check if leftIndex is 1 or start of list
        if(leftIndex != 1) {
            if(isRightIndexAtEnd) {
                left.next.next = null;
                left.next = right;
            } else {
                left.next.next = right;
                left.next = prev;
            }
        } else {
            if(isRightIndexAtEnd) {
                left.next = null;
                start = right;
            } else {
                left.next = right;
                start = prev;
            }

        }
    }

    public LinkedList constructLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(4);
        list.insert(-12);
        return list;
    }
}
