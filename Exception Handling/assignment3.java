import java.util.Scanner;
//Write a program that takes as input the size of the array and the elements in the array. The program then asks
// the user to enter a particular index and 
//prints the element at that index. Index starts from zero.
//This program may generate Array Index Out Of Bounds Exception or NumberFormatException . 
//Use exception handling mechanisms to handle this exception.
//Sample Input and Output 1: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the
// index of the array element you want to access 1 The array element at index 1 = 80 The array element successfully accessed
//Sample Input and Output 2: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the 
//index of the
// array element you want to access 9


public class assignment3 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size;
        size=sc.nextInt();
        int[] arr=new int[size];
        for( int i=0; i<size;i++){
            int n=sc.nextInt();
              arr[i]=n;

        }
        System.out.println("Enter the index of the array element you want to access");
        int access=sc.nextInt();
       
        try {
            
            for (int i = 0; i <= access; i++) {
                if (access==i) {
                    System.out.println("Your item is"+" "+arr[i]);
                    
                }
                
            }
        } catch (Exception e) {
           System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }

        
    }
}
