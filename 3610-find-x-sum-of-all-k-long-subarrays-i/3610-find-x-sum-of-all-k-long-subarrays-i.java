class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
    int ans[] = new int[nums.length - k + 1];
        int j = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            check(i, k, x, nums, ans, j);
            j++;
        }
        return ans;
    }

    public void check(int st, int k, int x, int[] nums, int[] ans, int j) {
        HashMap<Integer, Integer> demo = new HashMap<>();
        for (int i = st; i < st + k; i++) {
            demo.put(nums[i], demo.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(demo.entrySet());
        list.sort((e1, e2) -> {
            if (!e2.getValue().equals(e1.getValue()))
                return e2.getValue() - e1.getValue();
            else
                return e2.getKey() - e1.getKey();
        });

        int sum = 0;
        for (int i = 0; i < Math.min(x, list.size()); i++) {
            sum += list.get(i).getKey() * list.get(i).getValue();
        }

        ans[j] = sum;
    }

        
}
