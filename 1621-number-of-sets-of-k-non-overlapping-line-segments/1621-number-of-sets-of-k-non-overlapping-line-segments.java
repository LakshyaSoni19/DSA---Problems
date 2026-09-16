class Solution {
    public int numberOfSets(int n, int k) {
        long MOD =1000000007;

        long[][] dp = new long[k+1] [n];
        for(int i = 0; i<n ; i++){
            dp[0] [i] = 1;
        } 
        for(int segments = 1; segments <=k ; segments++){
            long open = 0 ;
            for(int point = 1; point < n; point++){
                open = (open + dp[segments - 1][point - 1]) % MOD;

                dp[segments][point] =
                    (dp[segments][point - 1] + open) % MOD;
            }
        }
        return (int) dp[k] [n-1];
    }
}