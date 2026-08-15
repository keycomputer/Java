import java.util.ArrayList;
import java.util.List;
/**
 * DiceThrower - Generates all possible dice roll combinations that sum to a target
 *
 * This algorithm uses recursive backtracking to find all combinations of dice rolls
 * (faces 1-6) that sum to a given target value.
 *
 * Example: If target = 4, possible combinations include:
 * - "1111" (1+1+1+1 = 4)
 * - "13" (1+3 = 4)
 * - "22" (2+2 = 4)
 * - "4" (4 = 4)
 */
public final class DiceThrower {

    private DiceThrower() {
    }

    public static List<String> getDiceCombinations(int target) {
        if (target < 0) {
            throw new IllegalArgumentException("Target must be non-negative");
        }
        return generateCombinations("", target);
    }

    public static void printDiceCombinations(int target) {
        if (target < 0) {
            throw new IllegalArgumentException("Target must be non-negative");
        }
        printCombinations("", target);
    }
    private static List<String> generateCombinations(String current, int remaining) {
        List<String> combinations = new ArrayList<>();

        // Base case: if remaining sum is 0, we found a valid combination
        if (remaining == 0) {
            combinations.add(current);
            return combinations;
        }

        // Try all possible dice faces (1-6), but not more than remaining sum
        for (int face = 1; face <= 6 && face <= remaining; face++) {
            List<String> subCombinations = generateCombinations(current + face, remaining - face);
            combinations.addAll(subCombinations);
        }

        return combinations;
    }

    private static void printCombinations(String current, int remaining) {
        // Base case: if remaining sum is 0, we found a valid combination
        if (remaining == 0) {
            System.out.println(current);
            return;
        }

        // Try all possible dice faces (1-6), but not more than remaining sum
        for (int face = 1; face <= 6 && face <= remaining; face++) {
            printCombinations(current + face, remaining - face);
        }
    }

    public static void main(String[] args) {
        int target = 6;

        System.out.println("All dice combinations that sum to " + target + ":");
        List<String> combinations = getDiceCombinations(target);

        for (String combination : combinations) {
            System.out.println(combination);
        }

        System.out.println("\nTotal combinations: " + combinations.size());
    }
}