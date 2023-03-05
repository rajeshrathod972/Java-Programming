import java.util.Scanner;
// Write a Program that will check whether a given String is Palindrome or not
public class assignment1 {
    public static void main(String[] args) {
        System.out.println("enter the strng");
        try (Scanner sc = new Scanner(System.in)) {
            String a=sc.next();
            StringBuffer sb=new StringBuffer(a);
            if(a.equals(sb.reverse().toString())){
                System.out.println("string is palindrome");
            }
            else{
                System.out.println("string is not palindrome");
            }
        }
        
    }
    
}
