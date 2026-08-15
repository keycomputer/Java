package Java.Searches;

interface SearchAlgorithm {
    /**
     * @param key is an element which should be found
     * @param array is an array where the element should be found
     * @param <T> Comparable type
     * @return first found index of the element
     */
    <T extends Comparable<T>> int find(T[] array, T key);
}
public class BinarySearch implements SearchAlgorithm{
    @Override
    public <T extends Comparable<T>> int find(T[] array, T key) {
        // Handle edge case: null or empty array
        if (array == null || array.length == 0) {
            return -1;
        }
        if (key == null) {
            return -1;
        }
        return search(array, key, 0, array.length - 1);
    }
    /**
    
     * <p>Time Complexity: O(log n) because we halve the search space each time.
     * Space Complexity: O(log n) due to recursive call stack.
     *
     * @param <T> The type of elements (must be Comparable)
     * @param array The sorted array to search in
     * @param key The element we're looking for
     * @param left The leftmost index of current search range (inclusive)
     * @param right The rightmost index of current search range (inclusive)
     * @return The index where key is located, or -1 if not found
     */
    private <T extends Comparable<T>> int search(T[] array, T key, int left, int right) {
        if (right < left) {
            return -1; // Key not found in the array
        }
        int median = (left + right) >>> 1; // Unsigned right shift is faster division by 2
        // Get the value at middle position for comparison
        int comp = key.compareTo(array[median]);
        // Case 1: Found the target element at middle position
        if (comp == 0) {
            return median; // Return the index where element was found
        }
        // Case 2: Target is smaller than middle element
        else if (comp < 0) {
            // New search range: [left, median - 1]
            return search(array, key, left, median - 1);
        }
        // Case 3: Target is greater than middle element
        else {
            // New search range: [median + 1, right]
            return search(array, key, median + 1, right);
        }
    }
}
