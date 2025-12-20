public class OOPS{
    public static void main(String args[]){

        BankAccount myacc=new BankAccount();
        myacc.username="manuarrow"; 
        myacc.setPassword("abcdefghijkl");
    }
} 

class BankAccount{
    public String username; 
    private String password; 
    public void setPassword(String pwd){
        password=pwd;
    }
}


// class Pen{
//     String color;
//     int tip;

//     void setColor(String newcolor ){
//         color=newcolor;
//     }
//     void setTip(int newTip){
//         tip=newTip;
//     }
// }

// class Student{
//     String name;
//     int age;
//     float percentage; 

//     void calcPerccentage(int math, int phy, int chem){
//         percentage=(phy+chem+math)/3;

// }

// }