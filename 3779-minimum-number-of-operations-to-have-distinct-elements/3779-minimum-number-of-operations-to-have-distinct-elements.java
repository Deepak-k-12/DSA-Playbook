import java.util.HashMap;

class Solution {
    int c = 0;
    int count = 0;

    public int minOperations(int[] nums) {
        c = 0;
        count = 0;
        
        HashMap<Integer, Integer> demo = new HashMap<>();

        for (int i : nums) {
            demo.put(i, demo.getOrDefault(i, 0) + 1);
        }
        for (Integer i : demo.values()) {
            if (i == 1) { count += 1; }
        }
        
        if (count == demo.size()) { return 0; }

        for (int i = 0; i < nums.length; i += 3) {
            c += 1;
            if (check(i, nums, demo)) {
                break;
            }
        }
        
        return c;
    }

    public boolean check(int st, int[] nums, HashMap<Integer, Integer> demo) {
        int len = nums.length;

        for (int i = st; i < len; i++) {
            if (i == st + 3) { break; }
            
            demo.put(nums[i], demo.get(nums[i]) - 1);
            
            if (demo.get(nums[i]) == 1) { count += 1; }
        }
        
        return demo.size() == count;
    }
}