class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> demo=new ArrayList<>();
        int f=1;
        for(int i=1;i<n;i++){
            demo.add(i);
            f*=i;
        }
        demo.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans+=demo.get(k/f);
            demo.remove(k/f);
            if(demo.size()==0){
                break;
            }
            k=k%f;
            f=f/demo.size();
        }
        return ans;
    }
}