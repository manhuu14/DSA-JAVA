public class reverseanarray {
    public static void reverseanarray(int array[]){ 
        for(int i=0;i<array.length-1;i++){
            int temp=array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]= temp;
        } 
        
    } 
    public static void main(String[] args) { 
        int array[]={1,2,3,4,5};
        reverseanarray(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
