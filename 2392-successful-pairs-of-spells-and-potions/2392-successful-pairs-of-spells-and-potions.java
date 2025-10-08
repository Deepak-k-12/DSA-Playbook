class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long suc) {
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int l=0;
            int h=potions.length-1;
            while(l<=h){
                int mid=(l+h)/2;
                if((long)potions[mid]*spells[i]>=suc){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            spells[i]=potions.length-l;
        }
        return spells;


    }
}