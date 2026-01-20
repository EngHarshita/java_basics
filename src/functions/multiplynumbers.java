package functions;
import java.util.Scanner;
public class multiplynumbers {
    public static int multiplyFun(int a,int b){
        int result=a*b;
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number =");
        int x=sc.nextInt();
        System.out.println("Enter the second number =");
        int y= sc.nextInt();
        int z=multiplyFun(x,y);
        System.out.println(z);

    }
}

