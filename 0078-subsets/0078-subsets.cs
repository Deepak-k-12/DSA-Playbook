public class Solution {
    public IList<IList<int>> Subsets(int[] nums) {
    Array.Sort(nums);
        IList<IList<int>> ans=new List<IList<int>>();
        Check(0,nums,ans,new List<int>());
        return ans;
    }

    public void Check(int i,int[] nums,IList<IList<int>> ans,IList<int> demo){
        ans.Add(new List<int>(demo));
        for(int st=i;st<nums.Length;st++){
            if(st>i && nums[st]==nums[st-1]){continue;}
            demo.Add(nums[st]);
            Check(st+1,nums,ans,demo);
            demo.RemoveAt(demo.Count-1);
        }
    }

}
