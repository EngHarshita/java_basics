package functions;
import java.util.Scanner;
public class factorial {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number =");
      int x=sc.nextInt();
      int factorial=factorial(x);
      System.out.println(factorial);

  }
}

