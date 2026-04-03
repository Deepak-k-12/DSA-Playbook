class Solution {

    public class Robot {
        int pos;
        int dist;

        Robot(int x, int y) {
            this.pos = x;
            this.dist = y;
        }
    }

    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        int n = robots.length;
        Robot arr[] = new Robot[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Robot(robots[i], distance[i]);
        }

        Arrays.sort(arr, (a, b) -> a.pos - b.pos);
        Arrays.sort(walls);

        
        int[][] dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            int pos = arr[i].pos;
            int dis = arr[i].dist;

            int left = (i > 0 ? arr[i - 1].pos : Integer.MIN_VALUE);
            int next = (i < n - 1 ? arr[i + 1].pos : Integer.MAX_VALUE);

            int left_st = Math.max(left + 1, pos - dis);
            int left_ed = pos;

            int right_st = pos;
            int right_ed = Math.min(next - 1, pos + dis);

            int countleft = getCount(walls, left_st, left_ed);
            int countright = getCount(walls, right_st, right_ed);

          
            int prevMaxNoOverlap = (i > 0) ? Math.max(dp[i - 1][0], dp[i - 1][2]) : 0;
            dp[i][0] = prevMaxNoOverlap + countleft;

            
            if (i > 0) {
                int prev_right_st = arr[i - 1].pos;
                int prev_right_ed = Math.min(arr[i].pos - 1, arr[i - 1].pos + arr[i - 1].dist);
                
                int overlap_st = Math.max(prev_right_st, left_st);
                int overlap_ed = Math.min(prev_right_ed, left_ed);
                int overlapCount = (overlap_st <= overlap_ed) ? getCount(walls, overlap_st, overlap_ed) : 0;
                
                dp[i][0] = Math.max(dp[i][0], dp[i - 1][1] + countleft - overlapCount);
            }

            int bestPrev = (i > 0) ? Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2])) : 0;
            dp[i][1] = bestPrev + countright;

            dp[i][2] = bestPrev;
        }

        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }

    public int getCount(int[] walls, int st, int ed) {
        if (st > ed) return 0;
        int a = find1(walls, st);
        int b = find2(walls, ed);
        if (a == -1 || b == -1 || a > b) return 0;
        return (b - a + 1);
    }

    public static int find1(int[] walls, int t) {
        int i = 0;
        int j = walls.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i+j) / 2;
            if (walls[mid] >= t) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int find2(int walls[], int t) {
        int i = 0;
        int j = walls.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (walls[mid] <= t) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }
}