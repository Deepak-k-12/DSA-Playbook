class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         boolean check=true;
        for(int i:nums2){
            map.put(i,map.getOrDefault(i,0)-1);
        }

        // if(map.size()==0) return 0;
        int tot=0;
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            int val=i.getValue();
            if(val%2!=0) return -1;
            tot+=Math.abs(val/2);
        }
        return tot/2;

    }
}