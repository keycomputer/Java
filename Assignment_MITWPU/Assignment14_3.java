
import java.util.LinkedList;

public class Assignment14_3 {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");

        System.out.println("Original List: " + cities);

        // Add First & Last
        cities.addFirst("Jaipur");
        cities.addLast("Chennai");

        System.out.println("After Adding: " + cities);

        // First & Last
        System.out.println("First City: " + cities.getFirst());
        System.out.println("Last City: " + cities.getLast());

        // Remove First & Last
        cities.removeFirst();
        cities.removeLast();

        System.out.println("After Removing: " + cities);

        // Search
        System.out.println("Contains Pune? " + cities.contains("Pune"));

        // Size
        System.out.println("Size = " + cities.size());

        // Iterate
        System.out.println("Cities:");
        for(String city : cities)
            System.out.println(city);

        // Clear
        cities.clear();

        System.out.println("Is Empty? " + cities.isEmpty());
    }
}