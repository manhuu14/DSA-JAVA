import java.util.ArrayList;

public class operations {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        // to add elements we use this one
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //to get elements we use this one 
        list.get(2);
        //list.get(index) than we will get the index value 

        //to delete also 
        //list.remove(index)
        list.remove(2); 

        //set Element at Index
        list.set(1,10);
        //list.set(index,element); 
        list.contains(1);//returns true or false value 


        //list.size();
        System.out.println(list.size());

        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        //print reverse of an arraylist 
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        } 

        // find maximum in an arraylist 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        } 

        System.out.println("max element = "+ max);

    }
}
