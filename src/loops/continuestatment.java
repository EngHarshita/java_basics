package loops;
import java.util.Scanner;
public class continuestatment {
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        int i;
        for(i=1;i<=7;i++){
            if(i==5){
             continue;
            }
            System.out.println(num*i);
        }
    }
}
