import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversa { 
    public static void reversalas(Queue<Integer> reversal){
        Stack<Integer> s=new Stack<>();
        while (!reversal.isEmpty()) {
            s.push(reversal.remove());
        } 
        while (!s.isEmpty()) {
            reversal.add(s.pop());
        }

    }
    public static void main(String args[]){
        Queue<Integer> reversal=new LinkedList<>(); 
        reversal.add(1);
        reversal.add(2);
        reversal.add(3);
        reversal.add(4);
        reversal.add(5);
        reversalas(reversal); 
        while (!reversal.isEmpty()) {
            System.out.print(reversal.remove());
        }
    }
}
