public class spiralmatrix {
    public static void spiral(int arr[][]){
        int startrow=0,startcol=0;
        int endrow=arr.length-1, endcol=arr[0].length-1; 
        while(startrow<=endrow && startcol<=endcol){
            for(int i=startrow;i<=endcol;i++){
            System.out.print(arr[startrow][i]); 
        } 
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]); 
            }
            for(int i=endcol-1;i>=startcol;i--){ 
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][i]);
            }  
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]);
            } 
            startcol++;
            startrow++; 
            endcol--;
            endrow--;

        }
        
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
        spiral(arr);

    }
}
