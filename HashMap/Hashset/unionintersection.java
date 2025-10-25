import java.util.*;
public class unionintersection {
    public static void union(int arr[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);

    } 
    public static void intersection(int arr[],int arr2[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++; 
                hs.remove(arr2[i]);
            } 

        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int arr[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};  
        union(arr, arr2);
        intersection(arr, arr2);
        
    }
}
