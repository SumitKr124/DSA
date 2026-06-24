package Array;

import java.util.*;

public class keyusingLinear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 12,10 ,8,10,  20, 15, 3};

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                found = true;

                System.out.println("Key found at index: " + i);

                if (key > 10) {
                    System.out.println("Double of key = " + (key * 2));
                } else {
                    System.out.println("Half of key = " + (key / 2.0));
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }

        sc.close();
    }
}