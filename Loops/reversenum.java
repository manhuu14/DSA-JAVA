public class reversenum {
    public static void main(String[] args) {
        int a=10899;
        int b=0;
        while(a>0){
            int c=a%10;
            b=(b*10)+c; 
            a=a/10;
        } 
        System.out.println(b);
    }
}
