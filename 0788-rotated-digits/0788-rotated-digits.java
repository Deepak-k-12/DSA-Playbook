class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(helper(i)){
                count+=1;
            }
        }
        return count;
    }

    public boolean helper(int num){
        boolean check=false;
        while(num!=0){
            int val=num%10;
            if(val==3 || val==4 || val==7) return false;
            if(val ==2 || val==5 || val==6 || val==9){
                check=true;
            }
            num=num/10;
        }
        return check;
    }
}