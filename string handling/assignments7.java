
import java.util.*;
//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string
// unchanged. If the input is "xHix", then output is "Hi".

public class assignments7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        String result="";

        if(s1.charAt(0) == s1.charAt(s1.length()-1)){
        StringBuffer sb=new StringBuffer(s1);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        result=sb.toString();
        System.out.println(result);
        }else{
            System.out.println(result);
        }
        sc.close();
        
    }
}
