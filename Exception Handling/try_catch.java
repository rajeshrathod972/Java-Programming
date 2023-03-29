import java.util.Scanner;

public class try_catch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Please Enter two no");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            c=a/b;
            System.out.println("div is "+" "+c);
            System.out.println("after");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}