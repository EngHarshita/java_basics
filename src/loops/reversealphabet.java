package loops;
import java.util.Scanner;
public class reversealphabet {
    public static void main(String args[]){
        char alphabet;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the alphabet character to get the reverse value");
        alphabet=sc.next().charAt(0);
        for(char i = alphabet; i>= 'A'; i--){
            System.out.println("here is reverse alphabet character=" +i );
        }
    }

}
