class Solution {
    public int numSquares(int n) {

        ArrayList<Integer> demo = new ArrayList<>();
        for (int i = 1; i*i <= n ; i++) {
            demo.add(i * i);
        }
        int dp[][] = new int[demo.size() + 1][n + 1];
        for (int i = 0; i <= demo.size(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return backtrack(0, n, demo, dp);
    }

    public int backtrack(int in, int n, ArrayList<Integer> demo, int[][] dp) {
        if (n == 0) {
            return 0;
        }
        if (in == demo.size() || n < 0) {
            return (int) 1e9;
        }
        if (dp[in][n] != -1) {
            return dp[in][n];
        }
        int pick = Integer.MAX_VALUE;
        if (demo.get(in) <= n) {
            pick = 1 + backtrack(in, n - demo.get(in), demo, dp);
        }
        int notpick = backtrack(in + 1, n, demo, dp);

        return dp[in][n] = Math.min(pick, notpick);
    }

}