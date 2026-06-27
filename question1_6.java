public class question1_6 {
    //Finding sum of numbers between given range using logical operators
    public static void sumOfNumbers(int a, int b)
    {
        int i = 1;
        int sum = 0;
        for(; ;)
        {
            if (i > b) {
                break;
            }
            if (i >=a && i <=b)
                sum += i;
            i++;
        }
        System.out.println("Sum of numbers between " + a + " and " + b + " is: " + sum);
    }
    public static void main(String[] args) {
        sumOfNumbers(100, 10000);
    }
}
