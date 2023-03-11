package array;
import java.util.*;


public class multidimentional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.err.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
                
            }
        }
        System.err.println("all elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               System.out.println(arr[i][j]);
                
            }
        }
    }
}
