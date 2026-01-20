package functions;
import java.util.Scanner;
//Write a function that takes in the radius as input and returns the circumference of a circle.
public class circle {
    public static double circumferencE(double r){
        double circumference = 2 * Math.PI * r; //m
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius =");
        double x=sc.nextInt();
        double radius=circumferencE(x);
        System.out.println("circumference of the circle =" +radius);

    }
}
