import java.util.*;
class question1_1_2
{
    public static void addNumbers(int a, int b)
    {
        System.out.println(a + b);
    }
    public static void addNumbers()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + b);
    }
       public static void main(String[] args) {
        addNumbers(10, 20);
        addNumbers();

    }
}