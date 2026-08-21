painterface function{
    int arithmetic(int a, int b);
}
@FunctionalIntckage Java;
import java.util.*;
@FunctionalInterface
erface
interface function2{
    boolean check (int a);
}
// interface EmployeeFilter{
//     boolean check (Employee e);
// }

interface Inner {
   default void diplay()
   {
    System.out.println("a");
   }
    void func1();
}
public class lambdaExpressions {
    public static void main(String[] args) {
        // f1 = lambda a , b :  a + b ;
        // f2 = lambda a  : a - a ; 

        function f1 = (x, y )-> x + y;
        function f2 = (x, y )-> x - y ;
        System.out.println(f1.arithmetic(100,200));
        System.out.println(f2.arithmetic(200,100));
        //////////////////////////////////////////////////
        function2 f3 = (x) -> (x % 2 ==0 ) ? true : false; 
        // function2 f4 = (x) -> {            
        //     }; 
        List <Integer> l1 = new Vector<>();
        l1.add(100);
        l1.add(101);
        l1.add(102);
        l1.forEach(i -> {
            if(i%2==0)
                System.out.println(i);
        });
    }
}
