public class starpattern{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("^");
            }  
            System.out.println();
        }
    //inverted star patterrn 
    for(int i=0;i<4;i++){
        for(int j=0;j<4-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }  
    //half pyramid pattern 
    for(int i=1;i<5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    } 
    //CHARACTER PATTERN 
    char ch='a';
    int n=4;
    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    } 
    //hallow recatangle pattter 
    for(int i=0;i<=5;i++){
        for(int j=0;j<=5;j++){
            if(i==0 || i==5 || j==0 || j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    } 
    //INVERTED & ROTATED HALF-PYRAMID PATTERN  
    for(int i=0;i<5;i++){
        for(int j=0;j<5-i;j++){
            System.out.print(" ");
        } 
        for(int k=0;k<i;k++){
            System.out.print("*");
        } 
        System.out.println(); 
    } 
    //INVERTED HALF-PYRAMID WITH NUMBERS PATTERN 
    for(int i=1;i<=5;i++){
        for(int j=1;j<=6-i;j++){
            System.out.print(j);
        } 
        System.out.println();
    } 
    // FLOYD'S TRIANGLE PATTERN 
    int a=1;
    for(int i=0;i<5;i++){
        for(int j=0;j<i;j++){
            System.out.print(a);
            a++;
        }
        System.out.println();
    }  
    // 0-1 triangle  
    for(int i=1;i<6;i++){
        for(int j=0;j<i;j++){
            if((i+j)%2==0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    } 
    // butterfly pattern 
    for(int i=1;i<=4;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            } 
            for(int k=1;k<=8-(2*i);k++){
                System.out.print(" ");
            } 
            for(int k=1;k<=i;k++){
                System.out.print("*");
            } 
            System.out.println();
    }
    for(int i=3;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            } 
            for(int k=1;k<=8-(2*i);k++){
                System.out.print(" ");
            } 
            for(int k=1;k<=i;k++){
                System.out.print("*");
            } 
            System.out.println();
    } 
    //RHOMBUS PATTERN 
    for(int i=1;i<=5;i++){
        for(int j=0;j<7-i;j++){
            System.out.print(" ");
        } 
        for(int j=0;j<7;j++){
            System.out.print("*");
        } 
        System.out.println();
    }
    // Number pyramid  
    int ani=1;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        } 
        for(int j=1;j<=i;j++){
            System.out.print(ani); 
            System.out.print(" ");
        } 
        ani++; 
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        } 
        System.out.println();
    } 
    //diamond pattern 
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        } 
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*"); 
        } 
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        } 
        System.out.println();
    } 
    for(int i=5;i>=1;i--){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        } 
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*"); 
        } 
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        } 
        System.out.println();
    }   
    //palindrome pattern  
 


} 
}