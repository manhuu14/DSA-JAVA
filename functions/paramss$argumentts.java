import java.util.Scanner;

public class paramss$argumentts {
    public static int calculattesum(int a, int b){ //parameters or formal parameter
        return a*b;
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculattesum(a, b);//arguments or actural parameters
        System.out.println(sum);
    }
}
