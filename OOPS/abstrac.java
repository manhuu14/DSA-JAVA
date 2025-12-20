public class abstrac {
    public static void main(String[] args) {
        // Horse h= new Horse();
        // h.eat(); 
        // h.walk(); 
        // System.out.println(h.color); 

        Mustang myHorse=new Mustang();
        //Animal->
        

    }
} 

abstract class  Animal { 

    Animal(){
        System.out.println("animal constructor called");
    } 
    String color;
    void eat(){
        System.out.println("animal eats");
    } 

    abstract void walk();
    
} 

class Horse extends Animal{  
    Horse(){
        System.out.println("horse contructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}  

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal{  

    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
