import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        int a,b,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Number");
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;
        System.out.println("max value is"+max);
    }
}
