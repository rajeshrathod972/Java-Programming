//Given a string, return a new string made of n copies of the first 2 chars of the original string where n 
//is the length of the string. The string may be any length. If there are fewer than 2 chars, use whatever 
//is there. If input is "Wipro" then output should be "WiWiWiWiWi".




import java.util.*;
public class assignments3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        String result="";
      if(s1.length()>=2){
        
        StringBuffer sb=new StringBuffer(s1);

        sb.delete(2,sb.length());
        for(int i=0;i<s1.length();i++){
            result=result+sb.toString();

        }
    System.out.println(result);
      }
       



        sc.close();
    }
    
}
