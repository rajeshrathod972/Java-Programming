import java.lang.*;
class A{
    
}

class B extends A{
    void disp(){
       
        System.out.println("in B");
    }
}



public class demoinheritance {
    public static void main(String[] args) {
        B t=new B();
        t.disp();
    
    }
}
