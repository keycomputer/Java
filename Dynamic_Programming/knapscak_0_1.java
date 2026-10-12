
package Dynamic_Programming;

                            // P1   P2   P3 
                            // 3    5    2 
                            // 100  200  120 
                            // W = 5kg 
                            // recurrsion -> Overlapping
//                          P1 selected        (220 MAX )            
//                     (W-2, profit= 100 )               (W-5, profit= 0)
//         P2                                                   P2
//     X        (w-2 , profit =100 )                   W=0, profit 200 
//   P3                 P3               X     
                       
//         (W=0, profit = 220 )     (w-2, proft100)
   


class knapscak_0_1 {
    // static int calcKnap(int W, int w[] , int p[], int n)  // O(2^n)
    // {
    //     int n1=0, n2=0;
    //     if(W==0 )
    //         return 0;
    //     else if (n==0)
    //         return 0;
    //     else
    //     {
    //         if (W >= w[n-1])
    //             n1 = p[n-1] + calcKnap(W-w[n-1], w, p, n-1); 
    //         n2 = calcKnap(W, w, p, n-1); 
    //         return  (n1 > n2 ? n1 : n2 );    // max ->          
    //     }
    // } 
    /// Me O( n * k )
    ///   0   1    2    3    4   5
    /// 0 0   0    0    0   0    0
    /// 1 
    /// 2
    /// 3 
    static int calcKnap(int W, int w[], int p[], int n, int memo[][])
    {
        int n1=0, n2=0 ;
        if(W==0 )
            return 0;
        else if (n==0)
            return 0;
        else
        {
            if(memo[n][W] != Integer.MAX_VALUE)
                return memo[n][W];

            if (W >= w[n-1])
                n1 = p[n-1] + calcKnap(W-w[n-1], w, p, n-1, memo); 
            n2 = calcKnap(W, w, p, n-1, memo); 
            memo[n][W] = (n1 > n2 ? n1 : n2 );
            return memo[n][W];
        }
    }
    public static void main(String[] args) {
        int p[]= {100, 130, 70};
        int w[] = {5,2,3};
        int W = 5 ;
       // System.out.println(calcKnap(W, w, p, p.length));
       int memo [][] = new int[p.length+1][W+1];  // Integer.max_value
       for(int i=0;i<=p.length;i++)
       {
        for(int j=0;j<=W;j++)
            memo[i][j] = Integer.MAX_VALUE;
       }
       System.out.println(calcKnap(W, w, p, p.length, memo));
    }
    
} 
