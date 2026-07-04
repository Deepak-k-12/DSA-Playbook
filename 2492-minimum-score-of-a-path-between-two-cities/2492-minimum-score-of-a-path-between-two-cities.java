class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> node=new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            node.add(new ArrayList<>());
        }

        for(int i[]:roads){
            node.get(i[0]).add(new int[]{i[1],i[2]});
               node.get(i[1]).add(new int[]{i[0], i[2]});
        }

        boolean visit[]=new boolean[n+1];

        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        visit[1]=true;
        int min=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            
            for(int i[]:node.get(q.poll())){
                min=Math.min(min,i[1]);
                
                if(!visit[i[0]]){
                    visit[i[0]]=true;
                    q.offer(i[0]);
                }
            }
            
        }
        return min;
    }
}