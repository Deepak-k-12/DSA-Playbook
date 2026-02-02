class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[]=new boolean[arr.length];
        return backtrack(start,arr,visited);
    }
    public boolean backtrack(int in,int []arr,boolean []visited){
        
        if(in>=arr.length|| in<0 || visited[in]){return false;}
        if(arr[in]==0){return true;}
        visited[in]=true;
        boolean op1=backtrack(in+arr[in],arr,visited);
        boolean op2=backtrack(in-arr[in],arr,visited);

        return op1 || op2;
        
    }
}