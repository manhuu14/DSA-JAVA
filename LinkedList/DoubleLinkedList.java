public class DoubleLinkedList {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }  
    }  
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node dll=new Node(data);
        size++;
        if(head==null){
            head=tail=dll;
        }else{
        dll.next=head;
        head.prev=dll;
        head=dll;}
    }  
    public void addLast(int data){
        Node newNode=new Node(data); 
        size++;
        if(head==null){
            head=tail=newNode;
        } 
        tail.next=newNode;
        newNode.next=null; 
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println();
    } 
    public int removeFirst(){
        if(head==null){
            System.out.println("Dll is empty"); 
        } 
        if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        } 
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }   
    public int removeLast() {
    if (head == null) {
        System.out.println("DLL is empty");
        return -1;   // return immediately
    }
    if (size == 1) {
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }  else{
    int val = tail.data;
    tail = tail.prev;
    tail.next = null;   // disconnect last node
    size--;
    return val;}
}

    public static void main(String args[]){
        DoubleLinkedList dl=new DoubleLinkedList(); 
        dl.addfirst(1);  
        dl.addLast(2);  
        dl.addLast(3);  
        System.out.println(dl.removeLast());
        dl.print();  
    }                         
}  
