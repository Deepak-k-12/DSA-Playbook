class Solution {
    public long minCost(String s, int[] cost) {
        int len=s.length();
        HashMap<Character,Long> demo=new HashMap<>();
        long total=0;
        for(int i=0;i<len;i++){
            demo.put(s.charAt(i),demo.getOrDefault(s.charAt(i),0L)+cost[i]);
            total+=cost[i];
        }
        if(demo.size()==1){return 0;}
        long max=0;
        for(Long i:demo.values()){
            max=Math.max(max,i);
        }
        
        return total-max;
    }
}