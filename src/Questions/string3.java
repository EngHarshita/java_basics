package Questions;
import java.util.Scanner;
/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"*/
public class string3 {
    public static String hellO(String a){
        if(a.length()<=2){
            return a;
        }
        return a.substring(0,2);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the word ");
        String x= sc.next();
        String hj=hellO(x);
        System.out.println(hj);

    }
}
