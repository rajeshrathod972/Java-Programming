package classes_and_object;
class test{
    int i,j;
    test(){
       i=10;
       j=20;
    System.out.println("constructor called");
    }
    void add(){
        System.out.println(i+j);
    }
}

public class constructor {
    public static void main(String[] args) {
        test t1=new test();
    test t2=new test();
    t1.add();
    t2.add();
    }
}
