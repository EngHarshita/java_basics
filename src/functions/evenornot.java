package functions;
import java.util.Scanner;
public class evenornot {
    public static int eveN(int a) {
        if (a % 2 == 0) {
            System.out.println("This is Even number");
        } else {
            System.out.println("this is not  even");
        }
        return a;

    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value");
            int x=sc.nextInt();
            int evnornot=eveN(x);
    }
}
