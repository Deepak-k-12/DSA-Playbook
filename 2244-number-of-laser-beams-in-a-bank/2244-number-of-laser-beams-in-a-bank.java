class Solution {
    public int numberOfBeams(String[] bank) {
        int sum=0;
        int c=0;
        for(String i:bank){
            int ones=cal(i);
            if(ones>=1){
                sum+=c*ones;
                c=ones;
            }
        }
        return sum;
    }

    public int cal(String str){
        int c=0;
        for(char ch:str.toCharArray()){
            if(ch=='1'){c+=1;}
        }
        return c;
    }
}