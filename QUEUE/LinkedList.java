public class LinkedList {
    static class  Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    } 
    public static class Queue {
        public static Node head;
        public static Node tail; 
        public static void add(int data){ 
            Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        } 
        public static int remove(){
            if(head.next==null){
                head=null; 
            }  
            int data=head.data;
            head=head.next;
            return data;
        } 
        public static int peek(){
            if(head==null){
                System.out.println("Empty queue"); 
                return -1;
            }
            return head.data;
        } 
        public static boolean isEmpty(){
            return head==null;
        }
        
    }
     public static void main(String args[]){

        Queue q=new Queue();
        q.add(1);;
        q.add(2);
        q.add(3); 
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

     }
}