import java.util.Scanner;

public class whileloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        while(b<a){
            System.out.print(b);
            b++;
        }    
    }
}