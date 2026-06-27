public class question1_3 {
    public static void largest(int a, int b, int c)
    {
        if(a >b && a >c)
            System.out.println("A");
        else if(b>a && b>c)
            System.out.println("B");
        else if(c>a && c>b)
            System.out.println("C");
    }
    public static void main(String[] args) {
        largest(10,12,50 );
    }
}
