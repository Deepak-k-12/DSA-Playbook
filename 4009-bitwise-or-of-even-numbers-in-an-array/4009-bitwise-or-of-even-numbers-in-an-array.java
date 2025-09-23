class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i%2==0){
                c=c|i;
            }
        }
        return c;
    }
}