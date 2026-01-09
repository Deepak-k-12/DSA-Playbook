class Solution {
    public int[] findErrorNums(int[] nums) {
        int []arr=new int[nums.length];
        int a=0;
        for(int i:nums){
            if(arr[i-1]!=0){
                a=i;
            }
            else{
                arr[i-1]=1;
            }
        }
        int ans[]=new int[2];
        ans[0]=a;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ans[1]=i+1;
                break;}

        }
        return ans;
    }
}