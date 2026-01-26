class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i+1]-arr[i])<min){
                ans.clear();
                ans.add(Arrays.asList(arr[i],arr[i+1]));
                min=Math.abs(arr[i+1]-arr[i]);
            }
            else if(Math.abs(arr[i+1]-arr[i])==min){
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return ans;
    }
}