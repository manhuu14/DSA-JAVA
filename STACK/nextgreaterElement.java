import java.util.*;

public class nextgreaterElement { 
    public static void greaterElement(int arr[]){ 
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int greater[]=new int[arr.length]; 
        for(int i=arr.length-1;i>=0;i--){
            while (!s.empty() && arr[s.peek()]<=arr[i]) {
                    s.pop();
            }  
            if(s.isEmpty()){
                 greater[i]=-1;
            }else{
                greater[i]=arr[s.peek()];
            } 
            s.push(i);
        }  
        int i=0;
        while (i<greater.length) {
            System.out.println(greater[i]);
            i++;
        }

    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};   
        greaterElement(arr); 
        
    }
}
