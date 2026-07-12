class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0;
        int i=0,j=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0;

        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];

            if(j-i+1>=k){
                if(k==map.size()){
                    ans=Math.max(ans,sum);
                }
                sum-=nums[i];
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;
        }

        return ans;
        
    }
}