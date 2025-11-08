class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int tar) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(cand);
        check(0,tar,cand,ans,new ArrayList<>());
        return ans;
    }

    public void check(int i,int tar,int[] cand,List<List<Integer>> ans,ArrayList<Integer> demo){
        if(tar==0){
            ans.add(new ArrayList<>(demo));
            return;
        }
        for(int st=i;st<cand.length;st++){
            if(st>i && cand[st]==cand[st-1]){continue;}
            if(cand[st]>tar){break;}

            demo.add(cand[st]);
            check(st+1,tar-cand[st],cand,ans,demo);
            demo.remove(demo.size()-1);
        }
    }
}