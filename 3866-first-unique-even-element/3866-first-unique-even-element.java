class Solution {
    public int firstUniqueEven(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums){
            arr[i]+=1;
        }
        for(int i:nums){
            if(i%2==0 && arr[i]==1) return i;
        }
        return -1;
    }
}