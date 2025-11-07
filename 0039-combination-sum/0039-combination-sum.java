class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int tar) {
        List<List<Integer>> ans=new ArrayList<>();
        check(0,cand,tar,ans,new ArrayList<Integer>());
        return ans;
    }

    public void check(int n,int []cand,int k,List<List<Integer>> ans,ArrayList<Integer> demo){
        if(k==0){
            ans.add(new ArrayList<>(demo));
            return;
            }
        if(n==cand.length){
            return;
        }

        if(cand[n]<=k){
            demo.add(cand[n]);
            check(n,cand,k-cand[n],ans,demo);
            demo.remove(demo.size()-1);
        }
        check(n+1,cand,k,ans,demo);
    }
}