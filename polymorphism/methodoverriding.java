package polymorphisam;

class A{
    void show(){
        System.out.println("in A");
    }
}

class B extends A{
    void show(){
     
        System.out.println("in B");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
    }
    
}
