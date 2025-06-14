import java.util.*;
public class array{
    public static void main(String args[]){
        int arr[][]=new int[3][3];  
        int m=arr.length; 
        int n=arr[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
        }

    }
}