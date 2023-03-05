import java.util.*;
public class findmaxno {
    public static void main(String[] args) {
        int x,y,z ,max=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();


        if(x>y && x>z){
            System.out.println("x is max"+x);
        }else if(y>x && y>z){
            System.out.println("max is"+y);
        }else{
            System.out.println("z is max"+z);
        }
    }
}
