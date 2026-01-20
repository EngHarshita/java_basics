package printingstarpattern;
import java.util.Scanner;

public class printeven {
    public static void main(String args[]) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an even number");
        num = sc.nextInt();

        // Check if the number is even
        if (num % 2 != 0) {
            System.out.println("Invalid number. Please enter an even number.");
        } else {
            // Print even numbers from 0 to num
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
