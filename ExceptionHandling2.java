import java.util.Scanner;
// // Throw 
// public class ExceptionHandling2 {
//     // static void function1(int num)
//     // {
//     //     if (num == 100)
//     //         throw new Exception("ABC");
//     // }
//     public static void main(String[] args) {
//         // Throw 
//         int num; 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number ");
//         num = sc.nextInt();
//         try{
//             if (num == 100)
//                 throw new Exception("Value is 100 ");
//             // function1(num);
//         }
//         catch (Exception exception) {
//             System.out.println("123");
//         }

//     }
// }

// throws 

/**
 * ExceptionHandling2
 */
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class ExceptionHandling2 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int a = br.read();

//     }
// }


// Chained Exception 

// public  class ExceptionHandling2
// {
//     public static void main(String[] args) {
//         try{
//             throw new ArithmeticException();
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e);
//             // e.initCause(e);
//             e.initCause(new NullPointerException());
//             System.out.println(e.getCause());
//         }
//     }
// }



