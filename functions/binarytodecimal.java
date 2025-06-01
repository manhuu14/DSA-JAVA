public class binarytodecimal {
    public static void main(String args[]){
        int n=1000; 
        double btd=0;
        int c=0;
        while(n>0){
            int a=n%10; 
            btd=btd+(a*Math.pow(2, c));
            c++;
            n=n/10;

        }
        System.out.print(btd);
    }
}
