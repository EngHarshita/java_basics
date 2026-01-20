package Questions;
import java.util.Scanner;
//take 3 no. input and tell if they can be the sides of triangle. (a+b)>c
public class triangleprblm {
    public static void main(String args[]) {
        int a, b, c,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers[sides of triangle] = ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) //
        {
            System.out.println("Triangle is valid " +(a+b>c || b+c>a || c+a>b));
        } else {
            System.out.println("not valid");
        }
    }
}
