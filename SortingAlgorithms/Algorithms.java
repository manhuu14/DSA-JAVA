public class Algorithms { 
    public static void bubbleS(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } 
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            } 
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    } 
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            } 
            arr[prev+1]=curr;
        }
    } 
    public static void countingsort(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){ 
            count[arr[i]]++;
        } 
        int j=0; 
        for(int i=0;i<count.length;i++ ){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 1, 2}; 
        //bubbleS(arr); 
        //SelectionSort(arr); 
        //insertionSort(arr);
        countingsort(arr);
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
