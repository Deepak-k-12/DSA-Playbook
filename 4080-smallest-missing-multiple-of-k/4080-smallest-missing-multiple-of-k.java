class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> demo=new HashSet<>();
        for(int i:nums){
            demo.add(i);
        }
        int step=k;
        while(true){
            if(!demo.contains(k)){return k;}
            else{
                k+=step;
            }
        }
    }
}