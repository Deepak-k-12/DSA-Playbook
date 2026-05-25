class Solution {
    public int minimumSwaps(int[] nums) {
     int c=0;
     for(int i=nums.length-1;i>=0;i--){
        if(nums[i]==0) c+=1;
     }
     int c1=0;
     for(int i=nums.length-1;i>=0;i--){
        if(c==0) break;
        if(nums[i]!=0) c1+=1;
        c-=1;
     }
     return c1;   
    }
}