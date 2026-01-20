package Questions;
import java.util.Scanner;
//make a calc n which show the selection operation
public class calculator {
    public static void main(String args[]){
        double num1,num2,result,square,max,min,power;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number = ");
        num1=sc.nextDouble();
        System.out.print("Enter the second number = ");
        num2=sc.nextDouble();
        System.out.println("\nSelect the operation");
        System.out.println("for addition + ");
        System.out.println("for subtraction - ");
        System.out.println("for multiplication * ");
        System.out.println("for division / ");
        System.out.println("for modulas % ");
        char operation=sc.next().charAt(0);
        switch(operation){
            case '+' :
                result=num1+num2;
                System.out.println("result =" +result);
                break;
            case '-' :
                result=num1-num2;
                System.out.println("result =" +result);
                break;
            case '*' :
                result=num1*num2;
                System.out.println("result =" +result);
                break;
            case '/' :
                result=num1/num2;
                System.out.println("result =" +result);
                break;
            case '%' :
                result=num1%num2;
                System.out.println("result =" +result);
                break;
            default:
                System.out.println("operation is not defined");
        }
        square= Math.sqrt(num1);
        System.out.println("Square of first number = " +square);
        min= Math.min(num1,num2);
        System.out.println("Minimum value  = " +min);
        max= Math.max(num1,num2);
        System.out.println("Maximum value = " +max);
        power= Math.pow(num1,num2);
        System.out.println("power of num1 = " +power);

    }
}
