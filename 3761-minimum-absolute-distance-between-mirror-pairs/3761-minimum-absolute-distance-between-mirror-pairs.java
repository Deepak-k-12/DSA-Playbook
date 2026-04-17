class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rev=helper(nums[i]);
            if(map.containsKey(rev)){
                List<Integer> list=map.get(rev);
                int idx=Collections.binarySearch(list,i);
                if(idx<0){
                    idx=-(idx+1);
                }
                else{
                    idx+=1;
                }
                if(idx<list.size()){
                    min=Math.min(min,list.get(idx)-i);
                }
                
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    public int helper(int n){
        int sum=0;
        while(n!=0){
           sum=sum*10+(n%10);
           n=n/10;
        }
        return sum;
    }
}