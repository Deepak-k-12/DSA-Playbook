class Solution {
    public long gcdSum(int[] nums) {
        long pref[]=new long[nums.length];
        long max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(max==nums[i]){
                pref[i]=max;
            }
            else{
                pref[i]=gcd(max,nums[i]);
            }
        }
        Arrays.sort(pref);
        long sum=0;
        int i=0,j=pref.length-1;
        while(i<j){
            sum+=gcd(pref[i],pref[j]);
            i++;
            j--;
        }
        return sum;
    }

    public long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}