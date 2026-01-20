package Questions;
import java.util.Scanner;
//take a year input through the user .write a program to determine whether the year is a leap year or not(considering a leap occurs after every four year)
public class leapyear {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
            sc.close();
        }
    }


