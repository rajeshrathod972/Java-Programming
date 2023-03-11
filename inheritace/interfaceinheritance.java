
interface A{
   public abstract void add(int x, int y); void sub(int x, int y);
   

}

class demo implements A{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void sub(int x, int y) {
        System.out.println(x-y);
    }
    
}


public class interfaceinheritance {
    public static void main(String[] args) {
        demo ob=new demo();
        ob.add(200, 300);
        ob.sub(10, 20);

    }
}
