package test1.linkedlist;

public class LinkedList {
    Node head;

    // adds a Node at the end of the list
    public void add(Node n) {
        if(head == null) {
            head = n;

        } else {
            // traverse the list
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = n;
        }
    }

    // delete a given node if present
    public void delete(Node n) {

        if(head == null) {
            System.out.println("Linked List empty");
        }

        Node temp = head;
        while(temp.next != null || !temp.data.equals(n.data)) {
            temp = temp.next;
        }
        if(temp.next == null) {
            System.out.println("Element not present");
        } else {
            Node previous = head;
            while(!previous.next.data.equals(n.data)) {
                previous = previous.next;
            }
            previous.next = temp.next;
        }
    }
}
