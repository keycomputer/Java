package Assignment_MITWPU.useful;

import java.util.Scanner;

public class useme {
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Square ");
        System.out.println("2. Rectangle");
        System.out.println("enter option ");
        int option = sc.nextInt();
        if (option == 1)
        {
            int l, b;
            System.out.println("Enter l and b");
            l = sc.nextInt();
            b = sc.nextInt();
            System.out.println(l * b);
        }
        else if (option == 2)
        {   int side ;
            System.out.println("Enter side ");
            side = sc.nextInt();
            System.out.println(side * side);
        }
        else{
            System.out.println("Invalid ");
        }
    }
    public void salary()
    {
        int basic ,hra, da , gross;

    }
    public void percentage()
    {
        float sub1, sub2, sub3, per;

    }
}
