package pck;
import java.util.function.Predicate;
 
public class PredicateFunctn {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(4));  // Output: true
        System.out.println(isEven.test(7));  // Output: false
        // System.out.println(isEven.test(true)); // Compile-time error
    }
}