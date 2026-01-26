class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<Integer> temp1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                temp.add(nums[i]);
                temp1.add(i);
            }
        }
        if (temp.size() == 0) return nums;
        int len=k%temp.size();
        int in=0;
        for(int i=len;i<temp.size();i++){
            nums[temp1.get(in)]=temp.get(i);
            in+=1;
        }
        for(int i=0;i<len;i++){
            nums[temp1.get(in)]=temp.get(i);
            in+=1;
        }
        return nums;
    }
}