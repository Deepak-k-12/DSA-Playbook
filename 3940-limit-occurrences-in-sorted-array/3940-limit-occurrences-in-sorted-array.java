class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int n=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            n+=1;
            if(map.get(nums[i])>k){
                map.put(nums[i],map.get(nums[i])-1);
                n-=1;
            }

        }
        int arr[]=new int [n];
        int in=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            int key=i.getKey();
            int val=i.getValue();

            for(int j=0;j<val;j++){
                arr[in++]=key;
            }
        }
        return arr;

    }
}