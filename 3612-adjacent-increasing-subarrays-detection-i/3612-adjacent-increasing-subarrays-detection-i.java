class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int len=nums.size();
        int adj=0;
        for(int j=0;j<len;j++){
            adj=0;
        for(int i=j;i<len;i+=k){
            if(check(nums,i,k)){
                adj+=1;
                        System.out.println(adj);

                if(adj==2){return true;}
            }
            else{break;}            
        }}
        System.out.println(adj);
        return false;
    }

    public boolean check(List<Integer> nums, int st,int k){
        if(st+k>nums.size()){return false;}
        int len=st+k;
        for(int i=st;i<len-1;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}