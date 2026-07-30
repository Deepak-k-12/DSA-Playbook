class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        if(len<=8) return len;

        int count=0;
        int c=1;
        while(len>0){
            if(len<=8){
                count+=(len*c);
            }
            else{
                count+=(8*c);
            }
            len-=8;
            c+=1;
        }

        return count;
        
    }
}