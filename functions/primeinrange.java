public class primeinrange {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            } 
           
        } 
         return true;
    }
    public static void primerange(int n){
        for(int i=0;i<n;i++){
            if(isPrime(i)==true){
                System.out.print(i+"-_-");
            }
        }
    } 
    public static void main(String args[]){
        primerange(20);
    }
} 
