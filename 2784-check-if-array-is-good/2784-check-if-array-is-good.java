class Solution {
    public boolean isGood(int[] nums) {
        int arr[]=new int[201];
        int max=0;
        for(int i:nums){
            arr[i]+=1;
            max=Math.max(i,max);
        }
        if(nums.length!=max+1){
            return false;
        }
        for(int i=1;i<=max;i++){
            if(arr[i]==1){
                continue;
            }
            else if(i==max && arr[i]==2){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}