import java.util.Scanner;

public class introdction { 
    public static void calculattesum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is :"+sum); 
    } 
    public static void calwithparams(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void main(String args[]){
        //let us discuss about the functtion syntax 
        /*
         * returnType name(type param1, type parm2){
         * //body 
         * return statement;
         * }
         */ 
        calculattesum(); 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calwithparams(a, b);
    }
}
