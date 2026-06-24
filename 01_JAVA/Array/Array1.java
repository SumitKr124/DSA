import java.util.Vector;

public class Array1 {

    public static void main(String[] args) {
        int arr[]  = { 10,20,30};
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}