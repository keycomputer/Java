import java.util.function.*;

@FunctionalInterface
interface Greeting {
    void hello();
}

public class Assignment12 {

    public static void main(String[] args) {

        // User-defined Functional Interface
        Greeting g = () -> System.out.println("Hello Java");
        g.hello();

        // Consumer
        Consumer<String> c = name -> System.out.println("Consumer: " + name);
        c.accept("Akshima");

        // Predicate
        Predicate<Integer> p = n -> n > 18;
        System.out.println("Predicate: " + p.test(20));

        // Function
        Function<Integer, Integer> f = n -> n * n;
        System.out.println("Function: " + f.apply(8));

        // Supplier
        Supplier<String> s = () -> "Java Programming";
        System.out.println("Supplier: " + s.get());
    }
}
