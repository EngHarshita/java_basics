package Questions;
import java.util.Scanner;
//take 3 +ve integer and print the greatest of them.
public class greatestnumber {
    public static void main(String [] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b && a>=c){

            System.out.println("Greatest number is = " + a);
        }
        else if(b>=a && b>=c) {
            System.out.println("greatest number is = " + b);
        }
        else{
            System.out.println("greatest number is = " +c);
        }
    }
}
