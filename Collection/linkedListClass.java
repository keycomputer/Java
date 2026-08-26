package Java.Collection;

import java.util.*;
public class linkedListClass {
    public static void main(String[] args) {
        LinkedList <String> l1 = new LinkedList<>();
        l1.add("a1");
        l1.add("a2");
        l1.add("a3");
        l1.add("a4");
        l1.add("a5");
        l1.add(1,"b1");
        // addall // addFirst // addLast 
        // clear // clone 
        // contains // containAll 
        // add -> IllegalState
        // difference between add and offer , poll and remove 
        // exception raise 
        l1.offer("b2");
        l1.offerFirst("z1");
        l1.offerLast("z100");
        l1.poll();
        l1.pollLast();
        l1.pollLast();
// 
        System.out.println("First Element = " + l1.element());
        System.out.println("First Element "+ l1.peek());
        /// List Iterator 
        /// Split Iterator 
        /// 
        Iterator<String> iptr = l1.descendingIterator();
        while(iptr.hasNext())
        {
            System.out.print(iptr.next());
        }
        ///////////////////////////////////
        
    }
}
