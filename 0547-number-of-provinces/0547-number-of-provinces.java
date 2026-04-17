class Solution {
    public int findCircleNum(int[][] arr) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=arr.length;

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(arr[i-1][j-1]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }

        int visit[]=new int[n+1];
        int c=0;
        for(int i=1;i<visit.length;i++){
            if(visit[i]==0){
                c+=1;
                dfs(visit,i,adj);
            }
        }

        return c;
    }

    public void dfs(int []visit,int in,ArrayList<ArrayList<Integer>> adj){
        visit[in]=1;
        for(int j:adj.get(in)){
            
            if(visit[j]==0){
                dfs(visit,j,adj);
            }
        }
        return;
    }
}
   