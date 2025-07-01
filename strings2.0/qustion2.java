public class qustion2 {
    public static void main(String args[]){
        String str="WNEENESENNN"; 
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='W'){
                x=x-1;
            }
            else if(dir=='S'){
                y=y-1;
            }
            else if(dir =='E'){
                x=x+1;
            }
            else if(dir=='N'){
                y=y+1;
            }
        }
        int x2=x*x;
        int y2=y*y;
        System.out.println((float)Math.sqrt(x2+y2));
    }
}
