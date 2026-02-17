class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> demo=new ArrayDeque<Integer>();
        int n=nums.length;
        int arr[]=new int [n-k+1];
        int j=0;
        for(int i=0;i<n;i++){
            if(!demo.isEmpty() && demo.peek()==i-k){
                demo.poll();
            }

            while(!demo.isEmpty() && nums[i]>nums[demo.peekLast()]){
                demo.pollLast();
            }
            demo.offer(i);
            if(i>=k-1){
                arr[j++]=nums[demo.peek()];
            }
        }
        return arr;
    }
}