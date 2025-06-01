public class functionquestions {
    public static void average(int a, int b, int c){
        int average=a+b+c;
        System.out.println(average/3);
    } 
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }  
    public static int sumofInt(int n){
        int sum=0;
        while(n>0){
            int c=n%10;
            sum+=c;
            n=n/10;
        } 
        return sum;
    }
    public static void  isPalind(int n){ 
        int z=n;
        int a=0;
        while(n>0){
            int c=n%10;
            a=(a*10)+c;
            n=n/10;
        } 
        if(z==a){
            System.out.println("the given string is palindrrome");
        }else{
            System.out.println("not a palindrome function"+a);
        }
    }
    public static void main(String[] args) {
        isPalind(121);
    }
}
