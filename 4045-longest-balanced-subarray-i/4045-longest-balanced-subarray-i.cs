public class Solution {
    public int LongestBalanced(int[] nums) {
        int n=nums.Length,ans=0;
        for(int i=0;i<n;i++){
            HashSet<int> s=new HashSet<int>();
            int e=0,o=0;
            for(int j=i;j<n;j++){
                int x=nums[j];
                if(!s.Contains(x)){
                    s.Add(x);
                    if(x%2==0)e++;
                    else o++;
                }
                if(e==o){ans=Math.Max(ans,j-i+1);}
            }
        }
        return ans;
    }
}
