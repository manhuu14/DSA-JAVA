public class Heapsort { 
    public static void heapify(int arr[],int i, int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIndx=i;
        if(left<size && arr[left]>arr[maxIndx]){
            maxIndx=left;
        }
        if(right<size && arr[right]>arr[maxIndx]){
            maxIndx=right;
        }
        if(maxIndx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIndx];
            arr[maxIndx]=temp; 
            heapify(arr, maxIndx, size);
        } 
    } 
    public static void heapsort(int arr[]){
        //step-1 building maxHeap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr, i, n);
        }
        //step-2 push largest at end 
        for(int i=n-1;i>=0;i--){
            //swap 
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp; 
            heapify(arr, 0, i);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,5,4,3};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
