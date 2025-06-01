public class factorial { 
    public static int factorial(int n){
        int a=1;
        for(int i=0;i<=n;i++){
            a=a*i;
        } 
        return a;
    }
    public static void main(String args[]){
        factorial(6);
    }
}
