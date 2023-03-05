import java.util.*;

//Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on 
//the outside and the longer string on the inside. The strings will not be the same length, but 
//they may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".

public class assignments6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String s1=sc.nextLine();
        System.out.println("enter string2");
        String s2=sc.nextLine();
        String result="";
        if(s1.length()>s2.length() ){
               result=s2+s1+s2;
               System.out.println(result);
        }else{
            result=s1+s2+s1;
            System.out.println(result);
        }


        sc.close();
    }
}
