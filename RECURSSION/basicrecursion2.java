public class basicrecursion2 {
    //tiling problem 
    public static int tillingproblem(int n){ 
        //base case 
        if(n==1 || n==0){
            return 1;
        }  
        //kaam 
        // vertical choice 
        int fnm1= tillingproblem(n-1);
        int fnm2=tillingproblem(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
        
    } 
    // remove duplicates in a string 
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar - 'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currchar - 'a']=true; 
            removeDuplicate(str, idx+1, newStr.append(currchar), map);
        }
    } 
    // friends pairing problem
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice 
        //single 
        int fnm1=friendspairing(n-1);
        //pair 
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*fnm2;
        int totalways= fnm1+pairways;
        return totalways;

    } 
    //
    public static void printBinstrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinstrings(n-1, 0, str+"0");
        if(lastplace==0){
            printBinstrings(n-1, 1, str+"1");
        }
    }
     public static void main(String args[]){
        System.out.println(friendspairing(3));
        printBinstrings(4, 0, " ");
    }
}
