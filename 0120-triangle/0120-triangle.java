class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        int n=tri.size()-1;

        ArrayList<Integer> dp=new ArrayList<>();
        for(int i=0;i<=n;i++){
            dp.add(tri.get(n).get(i));
        }

        for(int i=n-1;i>=0;i--){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=i;j>=0;j--){
                int down=tri.get(i).get(j)+dp.get(j);
                int dg=tri.get(i).get(j)+dp.get(j+1);
                temp.add(0,Math.min(down,dg));
            }
            dp=temp;
        }
        return dp.get(0);
    }
}