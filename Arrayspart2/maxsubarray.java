public class maxsubarray { 
    public static void maxsubarray(int array[]){ 
        int max=0;
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j; 
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=array[k];
                }
                max=Math.max(currsum, max);
            }
        } 
        System.out.println(max);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        maxsubarray(array);
    }
}
