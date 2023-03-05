//Given two strings, append them together (known as "concatenation") and return the result. However, 
//if the concatenation creates a double-char, then omit one of the chars. If the inputs are
// “Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)

import java.util.*;;

public class assignments2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String s1=sc.nextLine();
        System.out.println("enter string 2");
        String s2=sc.nextLine();

        if(s1.endsWith("k") && s2.startsWith("k")){
            StringBuffer sb=new StringBuffer(s1);
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString()+s2);
        }
    }
}
