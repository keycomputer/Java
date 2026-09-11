
//  bufferedreader IOException 
// MYSql SQL 


// Throwable -> Parent 
//     1. Error -> 
//     2. Exception 
//                checked 
//                unchecked 

//         Predefined 
//         Userdefined 

import java.util.Scanner;

/**
 * ExceptionHandling
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        // try{
        //     System.out.println(1/0);
        //     System.out.println("12344");
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("Exception - > ");
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {

        // }
        // catch(Exception e)
        // {

        // }
        // Scanner  sc = new Scanner(System.in);
        // int a , b , index;
        // int arr[]= {1,2,3,4,5,6,7,8,9,0};
        // try{
           
        //     System.out.println("Enter any two numbers for division ");
        //     a = sc.nextInt();
        //     b = sc.nextInt();
        //     System.out.println("Division =  "+  (a/b));
        //     System.out.println("Enter index number to print value ");
        //     index= sc.nextInt();
        //     System.out.println("Value = " + arr[index]);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("Cannot divide by ZERO ");
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Index value doesnt exist");
        // }
//////////////////////////////////////////////////////
///  
Scanner  sc = new Scanner(System.in);
        int a , b , index;
        int arr[]= {1,2,3,4,5,6,7,8,9,0};
        try{
           
            System.out.println("Enter any two numbers for division ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Division =  "+  (a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by ZERO ");
        }
        try{
            System.out.println("Enter index number to print value ");
            index= sc.nextInt();
            System.out.println("Value = " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index value doesnt exist");
        }
        finally{
            System.out.println("Finally block Executed ");
        }
        
    }
     
}