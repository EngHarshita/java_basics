package Questions;
import java.util.Scanner;
//take a integer input from the user to check whether it is divisible or not by second number.
public class divisibility {
    public static void main(String args[]){
        int number,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        number= sc.nextInt();
        i=sc.nextInt();
        if(number%i == 0) {
            System.out.println("number is dvisible");
        }
        else {
            System.out.println("number is not");
        }
    }
}
