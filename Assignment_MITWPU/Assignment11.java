interface Greeting {
    void sayHello();
}

public class Assignment11 {
    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Hello! Welcome to Java Lambda Expressions.");
        };

        g.sayHello();
    }
}