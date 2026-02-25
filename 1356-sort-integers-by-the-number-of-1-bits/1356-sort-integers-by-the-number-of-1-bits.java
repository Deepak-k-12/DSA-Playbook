class Solution {
    public int[] sortByBits(int[] arr) {
        int nums[]=new int[arr.length];
        Arrays.sort(arr);
        Map<Integer,List<Integer>> map=new TreeMap<>();
        for(int i:arr){
            int count=Integer.bitCount(i);
            if(!map.containsKey(count)){
                map.put(count,new ArrayList<>());
            }
            map.get(count).add(i);
        }
        int in=0;
        for(List<Integer> list:map.values()){
            for(int i:list){
                nums[in++]=i;
            }
        }
        return nums;
    }
}