public class Solution {
    public IList<IList<int>> Permute(int[] nums) {

        IList<IList<int>> ans=new List<IList<int>>();
        bool[] arr=new bool[nums.Length];
        check(nums,arr,ans,new List<int>());
        return ans;
    }

    public void check(int[] nums,bool[] arr,IList<IList<int>> ans,IList<int> demo){
        if(demo.Count==nums.Length){
            ans.Add(new List<int>(demo));
            return;
        }

        for(int i=0;i<nums.Length;i++){
            if(!arr[i]){
                demo.Add(nums[i]);
                arr[i]=true;
                check(nums,arr,ans,demo);
                demo.RemoveAt(demo.Count-1);
                arr[i]=false;
            }
        }
    }
}
    