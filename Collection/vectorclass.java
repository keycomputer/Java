package Java.Collection;

import java.util.*;
public class vectorclass {
    public static void main(String[] args) {

        ///// Adding data and deleting //////
        // Vector<Integer> v1 = new Vector<>();
        // Vector<Integer> v2 = new Vector<>(100);
        // Vector<Integer> v3 = new Vector<>(v1);
        // Vector<Integer> v4 = new Vector<>(100,5); 
        // // newcapcity = old*2 
        
        // v1.add(100);
        // v1.add(200);
        // v1.add(0,300);
        // System.out.println(v1);
        // v2.addAll(v1);
        // v2.addAll(1,v1);
        // v1.addFirst(400);
        // v1.addLast(500);
        // v1.addElement(600);
        // System.out.println("v1 = "+v1);
        // System.out.println("v2 = "+v2);
        // v1.remove(0);
        // // v1.remove(40); 
        // Vector <String> v5 = new Vector<>();
        // v5.add("abc");
        // v5.add("abc2");
        // v5.remove("abc1");
        // v2.removeAll(v1);
        // System.out.println("v1 = "+v1);
        // System.out.println("v2 = "+v2);
        // v1.removeElementAt(0);
        // v1.removeElement(v5);
        // v1.removeAllElements(); 
        // v1.add(1);
        // v1.add(5);
        // v1.removeIf( i -> (i%2==0));
        // System.out.println(v1);

        //// Accessing and modifying 
        /// 
        // Vector <String> v1 = new Vector<>(10,2);
        // v1.add("a1");
        // v1.add("v2");
        // v1.add("r1");
        // v1.set(1, "z1");
        // v1.set(0, "m1");
        // System.out.println(v1);
        // System.out.println(v1.get(0));
        // Object [] arr = v1.toArray();
        // System.out.println(arr);
        // for(int i=0;i<arr.length;i++)
        //         System.out.println(arr[i]);

        // // capacity 
        // System.out.println(v1.capacity());
        // v1.add("a1");
        // v1.add("a1");
        // v1.add("a1");
        // v1.add("a1");
        // v1.add("a1");
        // v1.add("a1");
        // v1.add("a1");
        // v1.add("a1");
        // System.out.println("After adding " + v1.capacity());
        // v1.clear();
        // Vector <String> v2 = (Vector<String>)v1.clone();
////////////////////////////////////////////////////////////////////////
/// 
/// 
        Vector<Integer> v1 = new Vector<>() ;
        for(int i=1;i<=10;i++)
            v1.add(i);
        Vector<Integer> v2 = new Vector<>() ;
        for(int i=3; i<=6;i++)
            v2.add(i);
        //v1.removeRange(2,4); // version 24 
        v1.retainAll(v2);
        System.out.println(v1);
        v1.add(0);
        v1.add(100);
        v1.add(30);
        v1.add(40);
        // v1.sort(null);
        // System.out.println(v1);
        v1.sort(Collections.reverseOrder());
        System.out.println(v1);
        Collections.sort(v1); // natural order 
        System.out.println(v1);
        Collections.sort(v1,Collections.reverseOrder());
        System.out.println(v1);

        System.out.println("Contains Function :: "+ v1.contains(30));
        System.out.println("Contains Function :: "+ v1.contains(300));
        System.out.println("Contains Function :: "+ v1.indexOf(30));
        System.out.println("Contains Function :: "+ v1.indexOf  (300));
        System.out.println("Contains Function :: "+ v1.lastIndexOf(30));
        for(int i=0;i<v1.size();i++)
            System.out.println(v1.get(i));
        for(Integer i : v1)
            System.out.println(i);

        v1.forEach((i)->System.out.println(i));

        ///////////////////////////////////////////////////////// 
        /// 
        ListIterator listitr = v1.listIterator();
        while(listitr.hasNext())
            System.out.print(listitr.next() + " ");
        System.out.println();
        while(listitr.hasPrevious())
            System.out.print(listitr.previous() + " ");
        System.out.println();

        // Spliterator<Integer> sitr =v1.spliterator();
        // sitr.forEachRemaining(System.out::print);
        List<Integer> l1 = v1.subList(0, 5);
        
    }
}
