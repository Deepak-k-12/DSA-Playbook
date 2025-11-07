public class Solution {
    public IList<IList<int>> Combine(int n, int k) {
        IList<IList<int>> ans=new List<IList<int>>();
        Check(1,n,k,ans,new List<int>());
        return ans; 
    }

    public void Check(int i,int n,int k,IList<IList<int>> ans,List<int> demo){
        if(demo.Count==k){
            ans.Add(new List<int>(demo));
            return;
        }
        if (i > n) return;
        demo.Add(i);
        Check(i+1,n,k,ans,demo);
        demo.RemoveAt(demo.Count-1);
        Check(i+1,n,k,ans,demo);
    }
}