package Java.Basic;
import java.util.Scanner ; 

public class scannerclass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter integer value ");
        int i = s.nextInt();
        System.out.println("I = " + i);
        System.out.println("Enter boolean value ");
        boolean b = s.nextBoolean();
        System.out.println("B = " + b) ;
        System.out.println("Enter byte ");
        byte b2 = s.nextByte();
        System.out.println("Byte = "+ b2);
        System.out.println("Enter long value ");
        long l = s.nextLong();
        System.out.println("Long = "+l );
        System.out.println("Enter float value ");
        float f  = s.nextFloat();
        System.out.println("Float = " + f);
        System.out.println("Enter double ");
        double d = s.nextDouble();
        System.out.println("Double = " + d);
        System.out.println("Enter short value ");
        short sh = s.nextShort();
        System.out.println("Short = "+ sh);
        System.out.println("Enter name ");
        String s1 = s.next();
        System.out.println("Name = "+ s1);
        
    }    
}
