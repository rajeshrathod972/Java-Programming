import java.util.*;

//Given a string of even length, return the first half. So the string "CatDog" yields "Cat". 
//If the string length is odd number then return null.

public class assignments4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        String result="";

        if(s1.length()%2==0){
            StringBuffer sb=new StringBuffer(s1);
            result=sb.delete(sb.length()/2, sb.length()).toString();
            System.out.println(result);

        }
    }
}
