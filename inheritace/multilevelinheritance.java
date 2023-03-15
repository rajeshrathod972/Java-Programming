
class A{
    void add(){
        System.out.println("In A");
    }
}
class B extends A{
    void sub(){
        System.out.println("In B");
    }
}

class C extends B{
    void mul(){
        System.out.println("In C");
    }
}



public class multilevelinheritance {
    public static void main(String[] args) {
        C ob=new C();
        ob.sub();
        ob.add();
        ob.mul();

    }
}
