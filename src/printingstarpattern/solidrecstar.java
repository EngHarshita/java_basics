package printingstarpattern;
import java.util.Scanner;
public class solidrecstar {
    public static void main(String args[]){
        int row;
        int column;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row");
        row=sc.nextInt();

        System.out.println("Enter the column");
        column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
