class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){ans.add(i);}
        int count=0;
        while(true){
            if(is_sort(ans)){
                return count;
            }
            int in=getindex(ans);
            int val=ans.get(in)+ans.get(in+1);
            ans.remove(in+1);
            ans.set(in,val);
            count+=1;
        }
    }
    public boolean is_sort(List<Integer> ans){
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>ans.get(i+1)){return false;}
        }
        return true;
    }

    public int getindex(List<Integer> ans){
        int in=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ans.size()-1;i++){
            if(min>(ans.get(i)+ans.get(i+1))){
                min=ans.get(i)+ans.get(i+1);
                in=i;
            }
        }
        return in;
    }
}