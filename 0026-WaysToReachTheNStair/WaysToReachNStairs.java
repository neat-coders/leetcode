public class ClimbStairs {
    public static int countWays(int n) {
        int MOD = 1000000007;

        if (n == 0) return 1;
        if (n == 1) return 1;

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = (prev1 + prev2) % MOD;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println(countWays(4));  // Output: 5
        System.out.println(countWays(10)); // Output: 89
    }
}
