class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        Arrays.sort(cap);
        int c=0;
        int sum=0;
        for(int i:apple){
            sum+=i;
        }
        int j=cap.length-1;
        while(sum>0){
            sum-=cap[j];
            j--;
            c++;
        }
        return c;
    }
}