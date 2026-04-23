class Solution {
    public long[] distance(int[] nums) {
        long[]arr=new long[nums.length];
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(List<Integer> list:map.values()){
            int size=list.size();

            long pref[]=new long[size];
            pref[0]=list.get(0);

            for(int i=1;i<size;i++){
                pref[i]=list.get(i)+pref[i-1];
            }

            for(int i=0;i<size;i++){
                long idx=list.get(i);
                
                if(i==0){
                    arr[(int)idx] = pref[size - 1] - pref[0] - (long)idx * (size - 1);
                }
                else{
                    long left=(long)(idx*i)-pref[i-1];
                    long right=(pref[size-1] - pref[i]) - (long)(size-1-i)*idx;
                    arr[(int)idx]=left+right;
                }
            }

        }
        return arr;
}

}