class Solution {
    HashMap<String,Integer> map;
    public int countSequences(int[] nums, long k){
        map=new HashMap<>();
        return backtrack(0,1,1,nums,k);
    }

    public int backtrack(int in,long n,long d, int[] nums, long k) {
        if (in == nums.length) {
            if (n==d*k) {
                return 1;
            }
            return 0;
        }

        String str=in+" "+n+" "+d;
        if(map.containsKey(str)){
            return map.get(str);
        }
        int total=0;
        
        total+=backtrack(in+1,n*nums[in],d,nums,k);

        if (nums[in] != 0) {
            total+=backtrack(in+1,n,d*nums[in],nums,k);
        }

        total+=backtrack(in+1,n,d,nums,k);
        map.put(str,total);
        return total;
    }
}