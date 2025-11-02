
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> demo = new ArrayList<>();
        Arrays.sort(nums); 
        int st = nums[0];
        int end = nums[nums.length - 1];
        
        int j = 0;
        for (int i = st; i <= end; i++) { 
            
            while (j < nums.length && nums[j] < i) {
                j++;
            }
            
            if (j < nums.length && nums[j] == i) {
                j++; 
            } else {
                demo.add(i); 
            }
        }
        
        return demo;
    }
}
