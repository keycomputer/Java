
import java.util.Scanner;

// Try Block 
// public class ExceptionHandling3 {
//     public static void main(String[] args) {
//         try{
//             try {
//                 // ZERO DIVISION 
//             } catch (Exception e) {
//                 // TODO: handle exception
//             }
//             try {
//                 // ARRAYIndex 
//             } catch (Exception e) {
//                 // TODO: handle exception
//             }
//             System.out.println();
//         }
//         catch(Exception e)
//         {
//             //
//             System.out.println("Handled other exception ");
//         }
//     }
// }



//////////////// User Defined Exceptions 
/// 
// class InvalidNumber extends Exception
// {
//     InvalidNumber()
//     {
//         super("My custom Exception");
//     }
//     InvalidNumber(String message)
//     {
//         super(message);
//     }
//     @Override 
//     public String toString()
//     {
//         return "Invalid number entered by user.\nNumber Range Valid from 1 to 199";
//     }
// }
// public class ExceptionHandling3
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         try{
//             System.out.println("Enter any value");
//             num = sc.nextInt();
//             if (num <=0 || num >=200)
//                 throw new InvalidNumber("Number Entered by the user is "+num);
//         }        
//         catch(InvalidNumber e)
//         {
//             System.out.println(e);
//             System.out.println("Exception Handled ");
//             System.out.println(e.getMessage());
//         }
//     }
// }
import java.util.*;
class InvalidNumber extends Exception
{
    InvalidNumber()
    {
        super("My custom Exception");
    }
    InvalidNumber(String message)
    {
        super(message);
    }
    @Override 
    public String toString()
    {
        return "Invalid number entered by user.\nNumber Range Valid from 1 to 199";
    }
}
public class ExceptionHandling3
{
    public static void main(String[] args) throws InvalidNumber{
        
        throw new InvalidNumber("invalid");
    }
}
