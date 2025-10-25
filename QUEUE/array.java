//now we discuss about the implementation of queue with array 

import java.util.Queue;

public class array{ 
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        } 
        public static boolean isEmpty(){
            return rear==-1; 
        }  
        public static void add(int data){
            if(rear==size-1){
                System.out.print("Queue is full");
            }
            rear=rear+1;
            arr[rear]=data;
        } 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
            }  
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            } 
            rear=rear-1;
            return front;
        } 
        public static int peek(){
            if(isEmpty()){
                System.out.println("the give Queue is Empty");
                return -1;
            } 
            return arr[0];
 
        }  
        public static void print(){
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4); 
        q.add(5); 
        q.remove();
        q.remove(); 
        q.print();
        
    }
}