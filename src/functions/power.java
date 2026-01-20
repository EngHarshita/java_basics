package functions;
import java.util.Scanner;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
public class power {
    public static double poweR(double x,double n){
       double result=Math.pow(x,n);
       return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want power of");
        double a= sc.nextDouble();
        System.out.println("Enter the power number = ");
        double b= sc.nextDouble();
        double Powerdoublehogyi=poweR(a,b);
        System.out.println(Powerdoublehogyi);

    }
}
