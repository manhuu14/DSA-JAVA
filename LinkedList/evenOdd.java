class Solution {
    Node head; 

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to segregate even and odd nodes
    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        // Get pointer to the last node
        while (end.next != null)
            end = end.next;

        Node new_end = end;

        // Move all odd nodes before the first even node to end
        while (curr != end && curr.data % 2 != 0) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        // If first node is even
        if (curr.data % 2 == 0) {
            head = curr;

            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else {
            prev = curr;
        }

        // If end node is odd, move it to end
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    // Insert a new node at the beginning
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Print linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        Solution llist = new Solution();
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(2);
        llist.push(0);

        System.out.println("Original Linked List:");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Updated Linked List (Evens before Odds):");
        llist.printList();
    }
}
