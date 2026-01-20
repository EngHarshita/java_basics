package Questions;
import java.util.Scanner;
/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"*/
public class string2 {
    public static String JumblE(String a,String b ){
        return a+b+b+a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st words = ");
        String x=sc.next();
        System.out.println("Enter second word =");
        String y=sc.next();
        String abba=JumblE(x,y);
        System.out.println(abba);
    }
}
