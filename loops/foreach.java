import java.lang.reflect.Array;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        int p=2;
        int[] a={1,2,3,4,5,6,7,8,9,10};
        for (int i : a) {
            System.out.println(p*i);
        }
    }
}
