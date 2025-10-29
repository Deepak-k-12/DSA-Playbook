class Solution {
    public int smallestNumber(int n) {
        int i=1;
        int j=31;
        int ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            int cal=(1 << mid)-1;
            if(cal>=n){
                j=mid-1;
                ans=cal;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}