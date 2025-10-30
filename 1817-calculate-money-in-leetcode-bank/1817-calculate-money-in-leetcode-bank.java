class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int c=2;
        int j=1;
        for(int i=1;i<=n;i++){
            if(i%7==0){
                ans+=j;
                j=c;
                c++;
            }
            else{
            ans+=j;
            j++;}
            
        }
        return ans;
    }
}