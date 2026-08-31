package Java.Stack_LIFO;
import java.util.*;

// classes and interface // iterator 
//  List interface
   // ArrayList 
   // Vector 
   // Stack 
   // LinkedList 
   // AbstractList 
public class stackClass {
    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        //Character, Float, Double, Long, Boolean 
        // push - insert 
        for(int i=1;i<=5;i++)
            s1.push(i);
        System.out.println(s1.pop());
        //Search 
        System.out.println(s1.search(23)); ///( Object )

        System.out.println(s1.peek());
        while(!s1.empty())
            System.out.println(s1.pop());


    }
}
