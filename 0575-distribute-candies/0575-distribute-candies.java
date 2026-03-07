class Solution {
    public int distributeCandies(int[] candy) {
        int n=candy.length/2;
        HashSet<Integer> ans=new HashSet<>();
        for(int i:candy){
            ans.add(i);
        }
        return Math.min(n,ans.size());
    }
}