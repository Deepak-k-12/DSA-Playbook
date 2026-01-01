class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=1;
            if(digits[i]<=9){
                return digits;
            }
            else{
                digits[i]=0;
            }
        }

        int ans[]=new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}