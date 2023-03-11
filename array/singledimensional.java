package array;
import java.util.*;

public class singledimensional {
    
    public static void main(String[] args) {
        int [] arr=new int[5];
        // int arr1[]=new int[5];
        int i;
        System.out.println("Enter array:");
        Scanner sc=new Scanner(System.in);
        for ( i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

            
        }
        System.out.println("you array");
        for ( i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("using foreachloop");
        for (int j : arr) {
            System.out.println(j);
            
        }
    }
}
