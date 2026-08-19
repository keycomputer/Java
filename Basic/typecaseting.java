package Java.Basic;

public class typecaseting {
    public static void main(String[] args) {
        // Type Conversion 
		// Narrowing and Widening 
		
		// Widening 
		byte b = 10;
		short s = b ;
		int i = s;
		long l =i ;
		float f = l;
		double d = f ;
		System.out.println(d );
		// Narrowing 
		double d1 = 32770;
		float f1 = (float)d1;
		long l1 = (long)f1 ;
		int i1 = (int)l1; 
		short s1 = (short)i1; 
		byte b1 = (byte)s1;
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(b1);
        
    }
}
