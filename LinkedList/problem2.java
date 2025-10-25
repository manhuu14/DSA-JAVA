public class problem2 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    public static  Node head;
    public static  Node tail;
    public static int size; 
    public void addfirst(int data){ 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
        newNode.next=head;
            head=newNode;}
    }  
    public void deletingnafterm(int n, int m){
        Node temp=head; 
        int i=0;
        while(i<m-1){
            temp=temp.next; 
            i++;
        }  
        Node next;
        next=temp;
        for(int j=0;j<n;j++){
            next=next.next;
        } 
        temp.next=next;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }

    } 
    public Node swapNodes(){
        if(head==null && head.next==null){
            return head;
        } 
        Node first=head;
        Node sec=head.next;
        Node prev=null;
        while(first!=null && sec!=null){
            Node third=sec.next;
            sec.next=first;
            first.next=third;
            if(prev!=null){
                prev.next=sec;
            }else{
                head=sec;
            }  
            prev=first;
            first=third;
            if(third!=null){
                sec=third.next;
            }else{
                sec=null;
            }
        } 
        return head;
    } 
    public static void main(String args[]){
        problem2 ll=new problem2();  
        ll.addfirst(6); 
        ll.addfirst(5); 
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2); 
        ll.addfirst(1);  
        //ll.deletingnafterm(3, 2); 
        ll.swapNodes();
        ll.print();
        

    }
}
