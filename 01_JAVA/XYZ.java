import java.util.Scanner;

public class XYZ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((age > 18 && n > 10) ? "eligible" : "Not eligible");
        // if (age > 18 && n > 10) {
        //     System.out.println("eligible");
        // } else {
        //     System.out.println("Not eligible");
        // }

        // sc.close();

        // char grade = 'A';
        // switch (grade){
        //     case 'A':
        //         System.out.println("Excellent");
        //     case 'B':
        //         System.out.println("Good");
        //     case 'C':
        //         System.out.println("Average");
        //     default:
        //         System.out.println("Invalid");
        }
    }