class Solution {
    public int countTriples(int n) {
        int count=0;
        for (int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(j!=n && check(j+1,n,((i*i)+(j*j)))){
                    count++;
                }
            }
        }
        return count*2;
    }

    public boolean check(int st,int end,int ans){
        while(st<=end){
            int mid=(st+end)/2;
            if(ans<=(mid*mid)){
                if(ans==(mid*mid)){return true;}
                else{
                    end=mid-1;
                }
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
}