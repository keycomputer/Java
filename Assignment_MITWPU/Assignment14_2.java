import java.util.ArrayList;
import java.util.Collections;

public class Assignment14_2 {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);

        System.out.println("Original List: " + marks);

        // Add at index
        marks.add(2, 80);

        // Remove by index
        marks.remove(3);

        // Replace
        marks.set(0, 95);

        // Sort
        Collections.sort(marks);

        System.out.println("Sorted List: " + marks);

        // Maximum
        System.out.println("Highest Marks: " + Collections.max(marks));

        // Minimum
        System.out.println("Lowest Marks: " + Collections.min(marks));

        // Reverse
        Collections.reverse(marks);
        System.out.println("Reverse Order: " + marks);

        // Iterate
        System.out.println("Using For Loop:");
        for(int i=0;i<marks.size();i++)
            System.out.println(marks.get(i));

        // Clear
        marks.clear();

        System.out.println("Is Empty? " + marks.isEmpty());
    }
}
