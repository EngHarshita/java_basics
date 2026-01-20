package functions;
import java.util.Scanner;
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote
public class vote {
    public static int votE(int age){
        if(age>18){
            System.out.println("Eligible to give vote");
        } else{
            System.out.println("Not eligible");
        }
        return age;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age = ");
        int x= sc.nextInt();
        int eligible=votE(x);
    }
}
