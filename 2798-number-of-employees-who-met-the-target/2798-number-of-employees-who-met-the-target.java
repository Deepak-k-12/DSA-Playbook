class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){return hours.length-i;}
        }
        return 0;
    }
}