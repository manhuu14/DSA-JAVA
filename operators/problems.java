public class problems{
    public static void main(String args[]){
        int a =2;
        int b = 4; 
        int exp1 = (a*b/a);
        int exp2 = (a*(b/a));

        System.out.println(exp1);
        System.out.println(exp2); 
        int x=200, y=50, z=100;
        if(x>y && z<x){
            System.out.println("hello");
        }
        if(z>y && z<x){
            System.out.println("java");
        } 
        if((y+200)<x && (y+150)<z){
            System.out.println("hello java");

        } 
        int m,n,o;
        m=n=o=2;
        m+=n;
        n-=o;
        n/=(m+n); 
        System.out.println(m+","+n+","+o); 
         
    }
}