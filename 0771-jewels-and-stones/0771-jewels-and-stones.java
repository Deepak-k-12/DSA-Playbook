class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        int sum=0;
        for(int i=0;i<jewels.length();i++){
            try{
           sum+=map.get(jewels.charAt(i));}
           catch(Exception e){
            continue;
           }
        }
        return sum;
    }
}