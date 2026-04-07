class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        ArrayList<Integer> winner=new ArrayList<>();
        ArrayList<Integer> loser=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        for(int i[]:matches){
            map.put(i[1],map.getOrDefault(i[1],0)+1);
            map2.put(i[0],map2.getOrDefault(i[0],0)+1);

        }
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()==1){
                loser.add(i.getKey());
            }
            if(map2.containsKey(i.getKey())){
                map2.remove(i.getKey());
            }
        }
         for(Map.Entry<Integer,Integer> i:map2.entrySet()){
            winner.add(i.getKey());
         }
        Collections.sort(winner);
        Collections.sort(loser);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(winner);
        ans.add(loser);
        return ans;
    }
}