public class isprime{
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        } 
        return true;
        /*optimmized ones 
         * for(int i=0;i<=Math.sqrt(n);i++){
         * if(n%i==0){
         * return false}}
         */
    }
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
} 
//optimized beacuse somme times 
/*
 * 2x3
 * 3x2 to avoid this types ww used optimized
 */ 