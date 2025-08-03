public class basicrecursiion{ 

    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    } 
    //print increasing order number 
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        } 
        printInc(n-1);
        System.out.print(n+" ");

    }  
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static int printinc(int n){
        if(n==10){
            return n;
        }
        return printinc(n+1); 
    }
    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        return n+sumofn(n-1);
        } 
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    } 
    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]==arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    } 
    public static int firstOccurance(int arr[], int key, int i){
        if(i==arr.length-1){
            return-1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    } 
    public static int lastOccurance(int arr[],int key, int i){
        if(i==arr.length -1){
            return -1; 
        }
        int isFound=lastOccurance(arr, key, i+1); 
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    } 
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);}
    //optimized version of power of n
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedPower(x, n/2); 
        int halfpowersq=halfpower*halfpower;
        if(n%2==0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
 
    public static void main(String args[]){
        int n=10;
        //printInc(10); 
        System.out.println(fibonacci(5)); 
        //fibonacci(n);
    }
    } 