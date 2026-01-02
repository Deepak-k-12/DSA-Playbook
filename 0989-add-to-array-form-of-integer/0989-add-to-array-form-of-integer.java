class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int c=0;
        int k1;
        
    
        for(int i=num.length-1;i>=0;i--){
            k1=(k!=0?k%10:0);
            int val=num[i]+c+k1;
            if(val<=9){
                ans.add(0,val);
                c=0;
            }
            else{
                ans.add(0,val%10);
                c=val/10;
            }
            k=k/10;
        }
         while (k != 0 || c != 0) {
            int val = (k != 0 ? k % 10 : 0) + c;
            ans.add(0, val % 10);
            c = val / 10;
            k = k / 10;
        }
        return ans;

    }
}