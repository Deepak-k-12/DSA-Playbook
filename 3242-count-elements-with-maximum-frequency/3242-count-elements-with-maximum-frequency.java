class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> demo=new HashMap<>();
        int m=0;
        for(int i:nums){
            demo.put(i,demo.getOrDefault(i,0)+1);
            if(m<demo.get(i)){
                m=demo.get(i);
            }
        }
        int c=0;
        for(int i:demo.values()){
            if(i==m){
                c+=m;
            }
        }
        return c;
    }
}