package Java;
import java.util.function.*;

// boolean - return (for EXPRESSION )
// use to filter the data 
// test(T t)

// and
// or 
// negate 
// not jdk 10 or 11 

public class Predicateclass {
    public static void main(String[] args) {
        Predicate<Integer> obj = x -> x == 100 ; 
        System.out.println(obj.test(100));
        System.out.println(obj.test(101));
        Predicate<Character> obj2 = x -> Character.isLowerCase(x);
        System.out.println(obj2.test('a'));
        System.out.println(obj2.test('A'));
        // And 
        Predicate<Integer> P1 = x -> x >=1;
        Predicate<Integer> P2 = x -> x <=100;
        System.out.println("Check for Value 50 " + P1.and(P2).test(50));
        System.out.println("Check for Value 150 " + P1.and(P2).test(150));

        // Or  

        // negate
        Predicate <Integer> P3 = P1.negate();
        System.out.println("Negate for 1 " + P3.test(1));
        System.out.println("Negate for 0 "+ P3.test(0));
        
        // not     
        Predicate <Integer> P4 = Predicate.not(P1);
        System.out.println("Negate for 1 " + P4.test(1));
        System.out.println("Negate for 0 "+ P4.test(0));
    }
}
