//some basic notations 
// binary and & 
// binary xor ^ 
// binary ones complement ~ 
// binary left shift <<
// binary right shift>>
public class bitmanuplation {
    public static void evenOrodd(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    } 
    public static int getIthbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        return 1;
    } 
    public static int setIthbit(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;

    }
    public static int clearIthBit(int n, int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n, int i, int newbit){
        // if(newbit==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthbit(n, newbit);
        // } 
        n=clearIthBit(n, newbit); 
        int bitmask= newbit<<i;
        return n|bitmask;
    }
    public static int clearLastIbits(int n, int i){
        int bitmask=(~0)<<i;
        return n| bitmask;
    }
    public static int clearRangeOfBits(int n, int i, int j){
        int a=1<<j+1;
        int b=(1<<i)-1;
        int bitmask= a|b;
        return n& bitmask;
    }
    public static boolean PowerOftwo(int n){
        return (n & (n-1))==0;
    } 
    public static int coutnset1s(int n){
        int count=0;
        while (n>0) {
            if((n&1)!=0) count++;
            n=n>>1;
        }
        return count;
    }
    public static int Fastexponential(int n, int a){
        int ans=1;
        while (n>0) {
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~6);
        System.out.println(5<<2);
        System.out.println(5>>6); 
    }
}