class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
       HashMap<Integer,List<Integer>> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
         if(!map.containsKey(nums[i])){
            map.put(nums[i],new ArrayList<>());
         }
         map.get(nums[i]).add(i);
       } 
       for(int i=0;i<queries.length;i++){
         int key=nums[queries[i]];
         List<Integer> list=map.get(key);
         if(list.size()==1){
            queries[i]=-1;
            continue;
         }
           int j=Collections.binarySearch(list,queries[i]);
           if(j<0) continue;
           
           if(j==0){
            int val1=list.get(j+1)-list.get(j);
            int val2=list.get(j)+(nums.length-list.get(list.size()-1));
            queries[i]=Math.min(val1,val2);
           }
           else if(j==list.size()-1){
            int val1=list.get(j)-list.get(j-1);
            int val2=nums.length-list.get(j)+(list.get(0));
            queries[i]=Math.min(val1,val2);
           }
           else{
            int val1=list.get(j)-list.get(j-1);
            int val2=list.get(j+1)-list.get(j);
            queries[i]=Math.min(val1,val2);
             }
         
         
       }
       List<Integer> list1 = new ArrayList<>();
       for (int q : queries) {
            list1.add(q);
        }
        return list1;
    }
}