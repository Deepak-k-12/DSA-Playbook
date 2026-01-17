class Solution {
    public int[] bestTower(int[][] towers, int[] center, int r) {

        List<Integer> ans = new ArrayList<>();
        int arr[] = {-1, -1};

        int in = 0;
        int c = -1;

        for (int i[] : towers) {

            int a = Math.abs(i[0] - center[0]);
            int b = Math.abs(i[1] - center[1]);

            if ((a + b) <= r && c < i[2]) {
                ans.clear();
                ans.add(in);
                c = i[2];
            }

            else if ((a + b) <= r && c == i[2]) {
                ans.add(in);
            }

            in += 1;
        }

        if (ans.size() == 0) {
            return arr;
        }

        else if (ans.size() == 1) {
            int d[] = towers[ans.get(0)];
            arr[0] = d[0];
            arr[1] = d[1];
            return arr;
        }

        else {
            int bestIndex = ans.get(0);

            for (int i = 1; i < ans.size(); i++) {
                int curr = ans.get(i);

                int x1 = towers[bestIndex][0];
                int y1 = towers[bestIndex][1];

                int x2 = towers[curr][0];
                int y2 = towers[curr][1];

                if (x2 < x1 || (x2 == x1 && y2 < y1)) {
                    bestIndex = curr;
                }
            }

            arr[0] = towers[bestIndex][0];
            arr[1] = towers[bestIndex][1];
            return arr;
        }
    }
}
