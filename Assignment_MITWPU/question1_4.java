import java.util.*;
public class question1_4 {
    // Arithmetic operators using switch case.
    public static void switchCase()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter operator + - * / ");
        char ch = s.next().charAt(0);
        System.out.println("enter two numbes ");
        int a = s.nextInt();
        int b = s.nextInt();
        switch(ch)
        {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        
    }
    public static void main(String[] args) {
        switchCase();
    }
}
