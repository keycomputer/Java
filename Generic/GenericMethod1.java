

public class GenericMethod1 {
    public static <type> void display(type arr[])
    {
        for(type i : arr)
            System.out.println(i);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    } 
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
   public static void main(String[] args) {
        Integer [] arr1 = {10,20,30,40,50,60};
        Character[] arr2 = {'a','b','c','d','e'};
        display(arr1);
        display(arr2);
        GenericMethod1 obj1 = new GenericMethod1();
        
        GenericMethod1 obj2 = obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.equals(obj2));
   } 
}
