package loops;
import java.util.Scanner;
public class table {
    public static void main(String args[]){
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to get the table = ");
        i=sc.nextInt();
        for(int n=1;n<=10;n++){
            System.out.println(i + "*" + n + "=" + i*n );
        }
    }
}