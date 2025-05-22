public class typepromotion {
    public static void main(String args[]){
        /*1.Java automatically promotes each byte, short, or char operand to int 
         to int when evaluation an expression.
         2.if one operand is long, float or double the whole expression is promoted to long,float,or double respectively.

         */  
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println((a));
        System.out.println((int)(b-a)); 

        //following rule number1 
        short m = 5;
        byte n = 25; 
        char o = 'c';
        byte bt = (byte) (m+n+o); 
        System.out.println(bt);

        //rule 2 
        int i = 10;
        float j =20.25f;
        long k = 25;
        double l = 30;
        double ans = i + j + k +l; 
        System.out.println(ans);
    }
}
