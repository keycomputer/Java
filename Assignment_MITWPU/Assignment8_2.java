public class Assignment8_2 {
    public static void main(String[] args) {
        int arr[] = {12,3,4,5,6,7,8,9,10};
        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
