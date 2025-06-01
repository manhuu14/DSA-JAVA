public class Linearsearch{ 
    public static int linearsearch(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int key=4;
        int index=linearsearch(array,key);
        System.out.println(index);
    }
}