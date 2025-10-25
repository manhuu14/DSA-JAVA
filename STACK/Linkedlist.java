//implementation with the  Linked List ; 
import java.util.*;

public class Linkedlist {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    } 
    static class stacl {
         static Node head=null; 

         public static boolean isEmpty(){
            return head==null;
         } 
         public static void push(int data){ 
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            newNode.next=head;
            head=newNode;
         }  
         public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next; 
            return top;
         } 
         public static int peek(){
            if(isEmpty()){
                return -1;
            } 
            return head.data;
         }

        
    } 
    public static void main(String args[]){
        stacl ll=new stacl(); 
        ll.push(1);
        ll.push(2);
        System.out.println(ll.peek()); 
        System.out.println(ll.pop());
                System.out.println(ll.peek());


    }
}