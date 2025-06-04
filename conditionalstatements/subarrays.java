public class subarrays { 
    public static void subarrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                } 
                System.out.println();
            } 
            System.out.println();
        } 
        System.out.println();
    } 
    public static void maxSubarray(int arr[]){ 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j; 
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }  
                if(sum>max){
                    max=sum;
                } 
            }  
        }  
        System.out.println(max);
    
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,54};
        maxSubarray(arr);
    }
}
