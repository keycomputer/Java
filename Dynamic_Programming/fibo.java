package Dynamic_Programming;

//                       5 
//             4                       3 
//        3           2              2     1 
//    2     1       1   0          1  0    X 
// 1    0 

//   0    1     2     3     4      5 
     
public class fibo {
    static int fibonacci(int n , int dp[] )
    {
        if(n == 0 ) // base cond
            return  0; 
        else if (n == 1) // base cond 
            return  1; 
        
        
        if(dp[n] == Integer.MAX_VALUE) // first time calc 
        {
            dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp); 
        }
        else
            return dp[n];
        return dp[n];      
    }
    //  0   1  2  3  4  5 
    //  0   1  1 
    static int fibonacci_Tabulation(int n, int dp[])
    {
        dp[0] = 0 ; 
        dp[1] = 1; 
        for(int i= 2; i<=n;i++)
        {
            dp[i] = dp[i-2] + dp[i-1]; // dp[2] = 0 + 1 
        }
        return dp[n]; 
    }
// 0 1 1 2 3 5 
    public static void main(String[] args) {
        int n = 5 ;
        int dp [] = new int[n+1]; //  0 -  5  
        // 0 , 1 
        for(int i=0; i<dp.length; i++)
            dp[i] = Integer.MAX_VALUE;  // -1 
        System.out.println(fibonacci(n, dp));
    }
}
