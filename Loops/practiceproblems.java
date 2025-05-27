import java.util.Scanner;

public class practiceproblems {
 public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in);  
    int even=0;
    int odd=0;

     do {  
         System.out.println("please enter your number:-");
         int n=sc.nextInt(); 
         if(n==0){
            break;
         } 
         if(n%2==0){
             even=even+n; 
             System.out.println("the given function is added to even beacuse it is a even one");
         }
         else{
            odd=odd+n;
            System.out.println("the given function is added to odd beacuse it is a odd one");
         }
     } while (true);
 }   
}
