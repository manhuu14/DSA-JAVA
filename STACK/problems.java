import java.util.*;

public class problems { 
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>(); 
        StringBuilder sc= new StringBuilder(); 
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            s.push(curr);
        } 
        while (!s.isEmpty()) {
            sc.append(s.pop());
        } 
        return sc.toString();
    }  
    public static void pushatbottom(Stack<Integer>s , int top){
        if(s.isEmpty()){
            s.push(top); 
            return;
        } 
        int rop=s.pop();
        pushatbottom(s, top);  
        s.push(rop);

    }
    public static void reverseaStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseaStack(s);
        pushatbottom(s,top);
    }
    public static void main(String args[]){
        String str="abc";
        System.out.println(reverseString(str));  
        Stack<Integer> s= new Stack<>(); 
        s.push(1);
        s.push(2);
        s.push(3);
        reverseaStack(s); 
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
