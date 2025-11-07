public class Solution {
    public IList<IList<int>> CombinationSum(int[] cand, int tar) {
        IList<IList<int>> ans=new List<IList<int>>();
        Check(0,cand,tar,ans,new List<int>());
        return ans;
    }

    public void Check(int n,int[] cand,int k,IList<IList<int>> ans,List<int> demo){
        if(k==0){
            ans.Add(new List<int>(demo));
            return;
            }
        if(n==cand.Length){
            return;
        }

        if(cand[n]<=k){
            demo.Add(cand[n]);
            Check(n,cand,k-cand[n],ans,demo);
            demo.RemoveAt(demo.Count-1);
        }
        Check(n+1,cand,k,ans,demo);
    }
}