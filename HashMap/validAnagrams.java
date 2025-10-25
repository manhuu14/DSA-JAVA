import java.util.HashMap;

public class validAnagrams { 
    public static boolean isAnagram(String s1, String s2){ 
        HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char s=s1.charAt(i);
            hmp.put(s,hmp.getOrDefault(s,0)+1);
        } 
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(hmp.get(ch)!=null){
                if(hmp.get(ch)==1){
                    hmp.remove(ch);
                }else{
                    hmp.put(ch, hmp.get(ch)-1);
                }

            } else{
                return false;
            }
            
        } 
        return hmp.isEmpty();
    }
    public static void main(String args[]){
        String s1="race";
        String s2="carew"; 
        System.out.println(isAnagram(s1, s2));
       
    }
}
