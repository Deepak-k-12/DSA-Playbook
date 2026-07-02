class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;

        int ind=0;
        int current=0;

        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            
            current+=gas[i]-cost[i];

            if(current<0){
                current=0;
                ind=i+1;
            }
            
        }
        if(totalgas<totalcost) return -1;
        return ind;
    }
}