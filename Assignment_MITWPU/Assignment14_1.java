import java.util.*;

public class Assignment14_1 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display list
        System.out.println("Original List: " + fruits);

        // Insert element
        fruits.add(2, "Grapes");
        System.out.println("After Inserting: " + fruits);

        // Access element
        System.out.println("First Element: " + fruits.get(0));

        // Update element
        fruits.set(1, "Kiwi");
        System.out.println("After Updating: " + fruits);

        // Remove element
        fruits.remove("Orange");
        System.out.println("After Removing: " + fruits);

        // Size
        System.out.println("Size = " + fruits.size());

        // Search
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Iterate
        System.out.println("Using For-each Loop:");
        for(String f : fruits)
            System.out.println(f);

        // Clear
        fruits.clear();
        System.out.println("After Clear: " + fruits);
    }
}
