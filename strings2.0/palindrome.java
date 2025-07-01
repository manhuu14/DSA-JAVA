public class palindrome{ 
    public static boolean isPalindrome(String dd){
        for(int i=0;i<dd.length()/2;i++){
            if(dd.charAt(i)!=dd.charAt(dd.length()-1-i)){
                return false;
            }
        } 
        return true;
    }
    public static void main(String args[]){
        String dd="racecar";
        System.out.println(isPalindrome(dd)); 
    }
}