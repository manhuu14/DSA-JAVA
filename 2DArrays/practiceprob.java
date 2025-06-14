public class practiceprob {
    public static void countoftarget(int array[][]){
         int n=array.length, m=array[0].length; 
         int count=0;
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(array[i][j]==7){
                     count++;
                 }
             } 
         } 
         System.out.println(count);
    
    }  
    public static void sumofmatrix(int array[][]){
        int a=array.length;
        int b=array[0].length; 
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                sum+=array[i][j];
            }
        }
        System.out.println(sum);
    } 
    public static void transpose(int array[][]){
        int a=array.length;
        int b=array[0].length;
        int arr[][]=new int[b][a] ;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[j][i]=array[i][j];
            }
        } 
        int c=arr.length;
        int d=arr[0].length;
        for(int i=0;i<c;i++){
            for(int j=0;j<d;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int[][] array = { {4,7,8},{8,8,7} };  
        transpose(array);
    
    }
}
