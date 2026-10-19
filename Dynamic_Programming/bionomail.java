package Dynamic_Programming;

public class bionomail {
    static int binomial(int arr[][], int n, int k)
    {
        if (k == n || k == 0 ){
            arr[n][k] = 1 ;
            return arr[n][k] ;
        }
        else if(k > n ){
            arr[n][k] = 0 ;
            return arr[n][k] ;
        }
        else if (arr[n][k] != -1 )
            return arr[n][k];
        arr[n][k] = binomial(arr, n-1, k-1) + binomial(arr, n-1,k );
        return arr[n][k];
/////////////////////////////////////////////////////////////////////
    }
    public static void main(String[] args) {
        // int n , k ;
	   // n = 5;
	   // k = 3;
    //     int biomemo[][] = new int[n+1][n+1]; // 
    //     for(int i=0;i<=n;i++)
    //     {
    //         for(int j=0;j<=k;j++)
    //             biomemo[i][j] = -1;
    //     }
    //     System.out.println(binomial(biomemo, n, k ));
    //     for(int i=0;i<=n;i++)
    //     {
    //         for(int j=0;j<=k;j++)
    //             System.out.print(biomemo[i][j]+"\t");
    //         System.out.println();
    //     }
        
        //////////////Tabulation 
        int n = 5 , k = 3; 
        int biotab[][] = new int[n+1][n+1];
        for(int i=0; i<=n;i++)
        {
            for(int j=0;j <= i ; j++)
            {
                
                if(j==0 || j == i)
                    biotab[i][j] = 1;
                else
                    biotab[i][j] = biotab[i-1][j-1] + biotab[i-1][j];
            }
        }
        for(int i=0; i<=n;i++)
        {
            for(int j=0;j<= n ; j++)
            {
                System.out.print(biotab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
