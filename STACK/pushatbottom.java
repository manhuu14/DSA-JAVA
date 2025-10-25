import java.util.*;
public class pushatbottom { 
    public static void pushAtbottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        } 
        int top=s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>(); 
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4); 
        pushAtbottom(s, 5); 
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        } 

    }
}
