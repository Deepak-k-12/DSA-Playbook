class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int len=Integer.MAX_VALUE;
        while(j<cards.length){
            map.put(cards[j],map.getOrDefault(cards[j],0)+1);
            int val=map.get(cards[j]);
            if(val==2){
                len=Math.min(len,j-i+1);
                while(i<cards.length){
                    if(map.get(cards[i])==2){
                        map.put(cards[i],map.getOrDefault(cards[i],0)-1);
                        if(map.get(cards[i])==0){
                            map.remove(cards[i]);
                            }
                        i+=1;
                        break;
                    }
                    map.put(cards[i],map.getOrDefault(cards[i],0)-1);
                    if(map.get(cards[i])==0){
                        map.remove(cards[i]);
                    }
                    i+=1;
                    len=Math.min(len,j-i+1);
                }
            }
            j+=1;}

            return len==Integer.MAX_VALUE?-1:len;
         
    }
}