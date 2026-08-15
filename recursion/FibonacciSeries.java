public class FibonacciSeries {
     private FibonacciSeries() {
        throw new UnsupportedOperationException("Utility class");
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
