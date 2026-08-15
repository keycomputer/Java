interface Greeting {
    void sayHello();
}
interface Square {
    int square(int n);
}
interface Addition{
    int add(int a, int b);
}
public class Assignment11_1 {
    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Hello! Welcome to Java Lambda Expressions.");
        };
        g.sayHello();
         // Single Parameter
        Square s = (n) -> n * n;
        System.out.println("Square of 6 = " + s.square(6));

        // Multiple Parameters
        Addition a = (x, y) -> x + y;
        System.out.println("Sum = " + a.add(15, 25));
    }
}