// using with the jcf for every problem if interviewer ask implement from starting we use others 
import java.util.*;
public class stack {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        System.out.println(s.peek()); 
        s.add(3);
        s.add(4);
        System.out.println(s.pop()); 
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
}
