package loops;

import java.util.Scanner;

public class factorialuser {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        int factorial=1;
        for (int i=1;i<=num;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}
