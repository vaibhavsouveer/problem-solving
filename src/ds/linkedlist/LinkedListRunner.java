package ds.linkedlist;

class Node {
    int data;
    Node next;
    Node(){}
    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedListRunner {
    static int count = 0;
    Node start;
    Node rear;

    void reverse() {
        Node prev = start.next;
        Node curr = prev.next;
        Node next = curr.next;
        prev.next = null;
        while(next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
            curr.next = prev;

        }

    }
    String search(int x) {
        Node temp = start.next;
        //IF WE KEEP TEMP.NEXT != NULL, THE LAST ELEMENT WILL NEVER BE CHECKED.
        while(temp != null) {
            if(temp.data == x)
                return "Found";
            else
                temp = temp.next;
        }
        return "Not Found";
    }
    void deleteRear() {
        Node temp = start.next;
        //WE NEED TO STOP AT SECOND LAST NODE
        while(temp.next != rear)
            temp = temp.next;
        rear = temp;
        temp.next = null;

    }
    void deleteHead() {
        start.next = start.next.next;
    }
    void insertHead(int x) {
        Node temp = new Node(x);
        temp.next = start.next;
        start.next = temp;
    }
    void insertRear(int x) {
        if(count == 0) {
            start = new Node();
            start.next = new Node(x);
            rear = start.next;
            count++;
        }
        else {
            Node temp = new Node(x);
            rear.next = temp;
            rear = temp;
            count++;

        }
    }
    void display() {
        Node temp = start.next;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListRunner ll = new LinkedListRunner();
        System.out.println("Running!");
        ll.insertRear(45);
        ll.insertRear(12);
        ll.deleteHead();
        ll.insertRear(36);
        ll.insertRear(78);
        ll.insertRear(11);
        ll.deleteRear();
        ll.insertHead(22);
        ll.display();
        System.out.println(ll.search(78));
    }

}

