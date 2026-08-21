package Java;
interface Test
{
    void func1();
}
interface Test2<type> // Generic 
{
    void funct2(type x, type y);
}
////////  MULTILINE LAMBDA EXPRESSION 
public class lambdaExpression {
    public static void main(String[] args) {
        Test t1 = () ->{
            System.out.println("hello");
            System.out.println("World");
        };
        t1.func1();

        Test2<Integer> t2 = (x, y ) -> {
            int z = x+y;
            System.out.println(z);
        };
        t2.funct2(100, 200);
        Test2<String> t3 = (x, y ) -> {
            String z = x+y;
            System.out.println(z);
        };
        t3.funct2("abc", "xyz");

    }
}
