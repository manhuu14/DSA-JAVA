public class kadanesalgorithm {
    public static void kadanes(int arr[]){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        } 
        System.out.println(max);
    } 
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        kadanes(arr);
    }
}
