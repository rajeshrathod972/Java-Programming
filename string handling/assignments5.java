import java.util.*;

//Given a string, return a version without the first and last char, so "Wipro" yields "ipr".
// The string length will be at least 2.
public class assignments5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        String result="";
        if(s1.length()>=2){
            StringBuffer sb=new StringBuffer(s1);
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length()-1);
            result=sb.toString();
            System.out.println(result);
            
        }
        sc.close();
    }
}
