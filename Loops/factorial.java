import java.util.Scanner;

public class factorial {
 public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=30;i++){
        if((a%i)==0){
            System.out.println(i);
        }
    }
 }   
}
