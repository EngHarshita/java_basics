package functions;
//Write a function which takes in 3 numbers and returns the greater of among three.
import java.util.Scanner;
public class greatestnumber {
    public static int greatesT(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("This is the greatest number =" +a);
            return a;
        }else if(b>a && b>c){
            System.out.println("This is the greatest number ="+b);
            return b;
        }else{
            System.out.println("This is the greatest number ="+c);
            return c;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number =");
        int x=sc.nextInt();
        System.out.println("Enter the second number = ");
        int y= sc.nextInt();
        System.out.println("Enter the third number = ");
        int z=sc.nextInt();
        int greatest=greatesT(x,y,z);
    }
}
/*home :-
Make a function to check if a given number n is even or not.
Make a function to print the table of a given number n.*/