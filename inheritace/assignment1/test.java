package assignment1;
import java.util.*;
class student {
String name;
int roll_no;
Float marks;
Scanner sc=new Scanner(System.in);
student(){
    System.out.println("enter the name");
   name=sc.next();
   System.out.println("enter the roll no");
   roll_no=sc.nextInt();
   System.out.println("enter the marks");
   marks=sc.nextFloat();
}

    
}
class myrecord extends student{
    Float percentage;
    myrecord(){
        
        percentage=marks/10;

    }
    void show(){
       System.out.println("name is "+" "+name);
       System.out.println("roll no is "+" "+roll_no);
       System.out.println("percentage is "+" "+percentage);
    }

}

public class test {
    public static void main(String[] args) {
        myrecord ob=new myrecord();
        ob.show();
        
    }
}
