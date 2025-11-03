class Solution {
    public int minCost(String colors, int[] need) {
     int i=0;
     int j=1;
     int sum=0;
     while(j<colors.length()){
        if(colors.charAt(i)==colors.charAt(j)){
            if(need[i]<need[j]){
                sum+=need[i];
                i=j;
                j++;
            }
            else{
                sum+=need[j];
                j++;
            }
        }
        else{
        i=j;
        j++;}
     }
     return sum;
    }
}