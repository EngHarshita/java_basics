package functions;
//Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
public class amanavg {
    public static int averagE(int a,int b,int c,int result){
        result = (a+b+c)/3;
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int x=sc.nextInt();
        System.out.println("Enter the second value");
        int y= sc.nextInt();
        System.out.println("Enter the third value");
        int z=sc.nextInt();
        int avgg=(x+y+z)/3;
        int avg=averagE(x,y,z,avgg);
        System.out.println("Result =" +avg);
    }
}
