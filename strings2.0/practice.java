public class practice{
    public static void main(String args[]){
        String str="HiamIkkILK";
        int count=0;
        for(int i=0;i<str.length();i++){ 
            char a=str.charAt(i);
            char b=Character.toLowerCase(a);
            if(a==b){
                count++;
            }
        }
        System.out.println(count);
    }
}