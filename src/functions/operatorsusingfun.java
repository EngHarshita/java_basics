package functions;
import java.util.Scanner;
public class operatorsusingfun {
    public static double operatorS(int a,int b,char operators){
        switch (operators){
            case '+':
                System.out.println("Result = "+(a+b));
                break;
            case '-':
                System.out.println("Result = "+(a-b));
                break;
            case '*':
                System.out.println("Result = "+(a*b));
                break;
            case'/':
                System.out.println("Result = "+(a/b));
                break;
            case '%':
                System.out.println("Result = "+(a%b));
                break;
            default:
                System.out.println("Invalid");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y=sc.nextInt();
        System.out.println("Enter operator (+ or - or * or / or % )");
        char operations=sc.next().charAt(0);
        double result=operatorS(x,y,operations);
    }
}
