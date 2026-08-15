import java.util.*;

public class Assignment15{
    public static void main(String[] args) {

        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // 1. add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple"); // Duplicate element

        // 2. Display Set
        System.out.println("Initial Set:");
        System.out.println(fruits);

        // 3. size()
        System.out.println("\nSize of Set: " + fruits.size());

        // 4. contains()
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Pineapple? " + fruits.contains("Pineapple"));

        // 5. isEmpty()
        System.out.println("\nIs Set Empty? " + fruits.isEmpty());

        // 6. remove()
        fruits.remove("Banana");
        System.out.println("\nAfter Removing Banana:");
        System.out.println(fruits);

        // 7. addAll()
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Kiwi");
        moreFruits.add("Papaya");
        moreFruits.add("Apple");

        fruits.addAll(moreFruits);
        System.out.println("\nAfter addAll():");
        System.out.println(fruits);

        // 8. removeAll()
        fruits.removeAll(moreFruits);
        System.out.println("\nAfter removeAll():");
        System.out.println(fruits);

        // 9. retainAll()
        Set<String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("Orange");
        set2.add("Pineapple");

        fruits.retainAll(set2);
        System.out.println("\nCommon Elements (retainAll):");
        System.out.println(fruits);

        // 10. Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Enhanced for-loop
        System.out.println("\nUsing Enhanced For Loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. toArray()
        Object[] arr = fruits.toArray();
        System.out.println("\nElements using Array:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // 13. hashCode()
        System.out.println("\nHash Code of Set: " + fruits.hashCode());

        // 14. equals()
        Set<String> set3 = new HashSet<>();
        set3.add("Apple");
        set3.add("Orange");

        System.out.println("Set equals set3? " + fruits.equals(set3));

        // 15. clear()
        fruits.clear();
        System.out.println("\nAfter clear(): " + fruits);

        // 16. isEmpty()
        System.out.println("Is Set Empty Now? " + fruits.isEmpty());
    }
}