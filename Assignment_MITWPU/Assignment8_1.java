import java.util.*;

class Assignment8_1
{
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a / b );
        }        
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}