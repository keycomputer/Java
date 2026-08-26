package Java.Collection;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

import Java.Basic.print;

class arrayListclass
{
    public static void main(String[] args) {
        ArrayList <Integer> arr1 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>(10);
        ArrayList <Integer> arr3 = new ArrayList<>(arr2);

        for(int i=0; i < 10 ;i++)
            arr1.add(i);
        System.out.println(arr1);

        arr1.add(3, 100);
        arr1.addFirst(101);
        arr1.addLast(200);
        arr1.addAll(arr1);
        arr1.addAll(2,arr1);
        arr1.set(10,200);
        System.out.println(arr1);
        System.out.println(arr1.get(10));
        arr1.remove(10);
        Predicate<Integer> obj = x -> x == 100 ; 
        arr1.removeIf(obj);
        System.out.println(arr1);
        
        // arr1.clear();
        // arr1.sort(Comparator.naturalOrder()); // natural order 

        // arr1.sort(Collections.reverseOrder());
        // arr1.sort(Comparator.reverseOrder());
        arr1.forEach(System.out:: println);
        arr1.forEach(i ->  System.out.print(i));
        ListIterator<Integer> liptr = arr1.listIterator();
        while (liptr.hasNext()) {
            System.out.println(liptr.next());
        }
        Spliterator<Integer> siptr = arr1.spliterator();
        siptr.tryAdvance(System.out::print);
        siptr.forEachRemaining(System.out::print);
        //arr1.indexOf() ;
        //arr1.lastIndexOf(10);
        // arr1.isEmpty();
        //arr1.replaceAll();
        // arr1.toString()
    }
}