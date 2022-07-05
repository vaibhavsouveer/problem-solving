package dsa.ds.linkedlist;

public class CycleInLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList().constructLinkedList();
        list.printList();
        createCycle(list);
        System.out.println("Length of cycle = " + getLengthOfCycle(list.start));
    }

    private static int getLengthOfCycle(Node start) {
        Node fast = start;
        Node slow = start;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // to check edge case when there is only one node
        if (fast == null || fast.next == null) {
            return -1;
        }
        Node p = start;
        while (p != slow) {
            p = p.next;
            slow = slow.next;
        }
        // p points to starting node of cycle now
        System.out.println("Starting node of cycle is = " + p.data);
        int count = 1;
        Node temp = p;
        do {
            temp = temp.next;
            if(temp != p) {
                count++;
            }
        } while(temp != p);
        return count;
    }

    private static boolean detectCycle(Node start) {
        Node fast = start;
        Node slow = start;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    private static void createCycle(LinkedList list) {
        Node start = list.start;
        start = start.next.next;
        Node end = start;
        while(end.next != null) {
            end = end.next;
        }
        end.next = start;
    }
}
