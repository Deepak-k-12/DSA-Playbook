class Solution {
    public int maxPerformance(int n, int[] speed1, int[] efficiency, int k) {
        int mod=1000000007;
        int [][]arr=new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=speed1[i];
            arr[i][1]=efficiency[i];
        }

        Arrays.sort(arr,(a,b) -> b[1]-a[1]);
        long ans=0;
        long speed=0;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i[]:arr){
            int sp=i[0];
            int eff=i[1];

            speed+=sp;
            q.add(sp);
            if(q.size()>k){
                speed-=q.poll();
            }
            ans=Math.max(ans,speed*eff);
        }
        return (int)(ans%mod);
        
    }
}