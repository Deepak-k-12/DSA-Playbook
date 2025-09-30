class Solution {


    public int check(int []nums){
        if(nums.length==1){return nums[0];}

        int arr[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            arr[i]=(nums[i]+nums[i+1])%10;
        }
        
        return check(arr);
    }

    public int triangularSum(int[] nums) {
        
        return check(nums);
    }
}