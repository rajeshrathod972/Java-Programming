package polymorphisam;

class demo{
    void add(int x,int y){
        System.out.println("In addition");
        System.out.println(x+y);
    }

    void add(String x, String y){
        System.out.println("in concatination");
        System.out.println(x+y);
    }
}


public class methodoverloading {

    public static void main(String[] args) {
        demo ob=new demo();
        ob.add(15, 18);
        ob.add("hello", "world");
    }
    
}
