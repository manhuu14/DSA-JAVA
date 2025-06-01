public class decimaltobinary {
    public static void main(String[] args) {
    int mynum=8;
    int pow=0;
    int binNum=0;

    while(mynum>0){
        int rem=mynum%2; 
        binNum=binNum+(rem*(int)Math.pow(10,pow));
        pow++;
        mynum=mynum/2;
    } 
    System.out.println(binNum);
    }
}
