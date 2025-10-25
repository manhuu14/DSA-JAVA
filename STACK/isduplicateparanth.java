import java.util.Stack;

public class isduplicateparanth { 

    public static boolean  isDuplicateParanthesis(String expression){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<expression.length();i++){
            char curr= expression.charAt(i);
            if(curr==')'){
                int count=0;
                while (s.peek()!='(') {
                    s.pop(); 
                    count++;
                } 
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            } else{
                s.push(curr);
            }
        } 
        return false;
    }
    public static void main(String args[]){
        String expression="((a+b)+(c+d))";
        System.out.println(isDuplicateParanthesis(expression));
    }
}
