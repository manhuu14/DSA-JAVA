public class LinkedListCycle { 
    public class Node {   // <-- add static
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 
    public Node head;
    public Node tail;
    public static int size;

    // Function to create a linked list with a cycle
    public  void createCyclicList() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking nodes: 1 -> 2 -> 3 -> 4 -> 5
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a cycle: last node points to third
        fifth.next = third;
        head=first;
    } 
    public boolean isCycle(){
        Node slow=head;
        Node fast=head; 
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        } 
        return false;
    } 

    //removing the cycle 
    public void removingCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head; 
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        } 

        //find meeting point 
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }
        prev.next=null;
    } 
    public void printcycle(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }  
    //findmid for merge sort 
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next; 
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //merge for order 
    public Node merge(Node head1, Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while (head1!=null && head2!=null) {
            if(head1.data<=head2.data){
                temp.next=head1; 
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        } 
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        } 
        return mergedll.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid node;
        Node mid=getMid(head);
        //left & right parts dividing 
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(righthead);

        return merge(newLeft,newRight);
    } 
    public void ZigZag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow; 
        // reversse 2n half 
        Node curr=mid.next;
        mid.next=null;
        Node prev=null; 
        Node next; 
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 
        //zig zag form 
        Node left=head;
        Node right=prev;  
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL; 

            left=nextL;
            right=nextR;
        } 

        
    }

    public static  void main(String[] args) {
        LinkedListCycle lc=new LinkedListCycle();
        lc.createCyclicList();
        System.out.println(lc.isCycle());
       lc.removingCycle();
        System.out.println(lc.mergeSort(lc.head));
        lc.ZigZag(); 

        lc.printcycle();

        
    }
}
