package functions;
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
public class vacation {
    public static boolean vacatioN(boolean weekday,boolean vacation){
        if (!weekday || vacation) {
            return true;
        }
        return false;

        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
    }
    public static void main(String[] args) {
        System.out.println(vacatioN(false, false)); // true
        System.out.println(vacatioN(true, false));  // false
        System.out.println(vacatioN(false, true));  // true
        System.out.println(vacatioN(true, true));   // true
    }
}

