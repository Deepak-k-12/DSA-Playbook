class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int ans=helper(i);
            if(ans==2 || ans==3 || ans==5 || ans==7 || ans==11 || ans==13 || ans==17 || ans==19){
                count+=1;
            }
        }
        return count;
    }

    public int helper(int num){
        int count=0;
        while(num>0){
            if(num%2==1){count+=1;}
            num/=2;
        }
        return count;
    }
}