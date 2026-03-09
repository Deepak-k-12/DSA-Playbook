class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=0;
        for(int i:nums){
            if(set.contains(i+diff) && set.contains(i+(2*diff))) count++;
        }
        return count;
    }
}