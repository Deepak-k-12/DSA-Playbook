class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> l=new ArrayList<>();
        for(int i[]:grid){
            for(int j:i){
                l.add(j);
            }
        }
        Collections.sort(l);
        int n=l.size();
        // int m=n%2==0?(l.get(n/2-1)+l.get(n/2))/2:l.get(n/2);
        int m=l.get(n/2);
        int c=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(i==0){
                c+=Math.abs(l.get(i)-m)/x;
                o=l.get(i)%x;
            }
            else{
                if(o!=l.get(i)%x){
                    return -1;
                }
                c+=Math.abs(l.get(i)-m)/x;
            }
        }
        return c;
    }
}