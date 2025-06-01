public class Binarysearch{  
    public static int binarysearch(int array[],int key){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==key){
                return mid;
            }else if(array[mid]>key){
                end=mid-1;
            }else if(array[mid]<key){
                start=mid+1;
            } 
        } 
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int key=4;
        int index=binarysearch(array, key);
        System.out.println(index);
    }
}