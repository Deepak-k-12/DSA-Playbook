
class Solution {
    public int largestInteger(int n, int s) {
        int max = (int) Math.pow(10, n) - 1;

        for (int num = max; num >= 0; num--) {
            if (digitSum(num) == s) {
                return num;
            }
        }

        return -1;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}