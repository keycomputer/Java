// sorting 
// Arrays.sort

// weight / capacity = 100 
// items(w)     12      50      25    30    24
// profit(p)    1500    3500   2000   3000  5600
// Ratio     

package Java.Greedy;

import java.util.Arrays;
import java.util.Comparator;

class RatioCom  implements Comparator<int[]>
{
    public int compare(int x[], int y[])
    {
        float ratio1 = (float)x[1] / x[0]; // first item 
        float ratio2 = (float)y[1] / y[0] ;   // secodn item 
        // return ratio1 > ratio2 ? 1 :  0 ;
        return Float.compare(ratio2, ratio1);
    }
}
class knapfractional {
    public static void main(String[] args) {
             int w[] = {12,50,25,30,24, 10};
        int p[] = {1500, 3500, 2000, 3000, 5600 , 1234};
        int W = 100, total=0;
        int arr[][] = new int[w.length][2];
        for(int i=0; i<w.length;i++)
        {
            arr[i][0] = w[i];
            arr[i][1] = p[i];
        }
        Arrays.sort(arr, new RatioCom());
        for(int i=0;i<w.length;i++)
        {
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
        for(int i=0; i<w.length && W >0 ; i++)
        {
            if (arr[i][0] <= W)
            {
                W -= arr[i][0];
                total += arr[i][1]; 
            }
            else{
                total += (W *( (float)arr[i][1]/ arr[i][0] ));  //(3500/ 50 ); 
                W  = 0 ; //break; 
            }
            // 5600 + 1500 + 3000  + 2000 + 630 ;
        }
        System.out.println(total);
    
}