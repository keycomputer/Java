public class question1_5 {
    // Reversing the digits and finding sum of digits
    public static void reverseAndSum(int num) {
        int sum = 0, rev= 0;
        System.out.print("Reversed number: ");
        while (num > 0) {
            int digit = num % 10;
            rev = rev*10 + digit;
            sum += digit;
            num /= 10;
        }
        System.out.println("Reverse of digit "+ rev);
        System.out.println("\nSum of digits: " + sum);
    }
    public static void main(String[] args) {
        reverseAndSum(12345);
    }
}
