class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> demo=new HashMap<>();
        int []arr=new int[2];
        int j=0;
        for(int i:nums){
            demo.put(i,demo.getOrDefault(i,0)+1);
            if(demo.get(i)==2){
                arr[j++]=i;
            }
        }
        return arr;
    }
}