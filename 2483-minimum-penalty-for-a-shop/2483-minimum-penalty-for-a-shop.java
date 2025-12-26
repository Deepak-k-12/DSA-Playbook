class Solution {
    public int bestClosingTime(String cus) {
        int pre[] = new int[cus.length()];
        int ans = 0;
        int open = 0;
        int closed = 0;

        pre[0] = (cus.charAt(0) == 'Y') ? 1 : 0;
        for (int i = 1; i < cus.length(); i++) {
            int val = (cus.charAt(i) == 'Y') ? 1 : 0;
            pre[i] = pre[i - 1] + val;
        }

        int min = pre[cus.length() - 1];

        for (int i = 0; i < cus.length(); i++) {
            if (cus.charAt(i) == 'N') {
                open += 1;
            }

            closed = pre[cus.length() - 1] - pre[i];
            int penalty = open + closed;

            if (penalty < min) {
                min = penalty;
                ans = i + 1;
            }
        }

        return ans;
    }
}
