class Solution {
    int min=Integer.MAX_VALUE;
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(Map.Entry<Integer,List<Integer>> i:map.entrySet()){
            if(i.getValue().size()>=3){
                helper(i.getValue());
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }

    public void helper(List<Integer> list){
        int ans=0;
        for(int i=0;i<=list.size()-3;i++){
            int a=list.get(i);
            int b=list.get(i+1);
            int c=list.get(i+2);

            ans=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
            min=Math.min(min,ans);
        }
    }
}