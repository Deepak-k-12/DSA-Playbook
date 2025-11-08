public class Solution {
    public IList<IList<int>> CombinationSum2(int[] cand, int tar) {
        IList<IList<int>> ans=new List<IList<int>>();
        Array.Sort(cand);
        Check(0,tar,cand,ans,new List<int>());
        return ans;
    }

    public void Check(int i,int tar,int[] cand,IList<IList<int>> ans,List<int> demo){
        if(tar==0){
            ans.Add(new List<int>(demo));
            return;
        }
        for(int st=i;st<cand.Length;st++){
            if(st>i && cand[st]==cand[st-1]){continue;}
            if(cand[st]>tar){break;}

            demo.Add(cand[st]);
            Check(st+1,tar-cand[st],cand,ans,demo);
            demo.RemoveAt(demo.Count-1);
        }
    }
}