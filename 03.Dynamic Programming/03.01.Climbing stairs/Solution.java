public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        int i = 1;
        while (i <= n) {
            if (i == 1)
                dp[i] = 1;
            else if (i == 2)
                dp[i] = 2;
            else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            i++;
        }
        return dp[n];
    }
}
