class Solution {

    public void prime(boolean []pri,int n){
        Arrays.fill(pri,true);
        
        pri[0]=false;

        pri[1]=false;

        for(int i=2;i*i<=n;i++){
            if(pri[i]){
                for(int j=i*i;j<=n;j+=i){
                    pri[j]=false;
                }
                
            }
        }
    }

    public int countPrimes(int n) {
        boolean pri[]=new boolean[n+1];
        if(n==0 || n==1 || n==2){return 0;}
        prime(pri,n);
        int c=0;
       for(int i=2;i<n;i++){
        if(pri[i]){c++;}
       }
        return c;
    }
}