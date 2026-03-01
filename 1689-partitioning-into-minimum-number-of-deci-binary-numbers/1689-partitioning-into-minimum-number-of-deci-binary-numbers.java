class Solution {
    public int minPartitions(String n) {
        String max="0123456789";
        for(int i=max.length()-1;i>=0;i--){
            char ch=max.charAt(i);
            if(n.indexOf(ch)!=-1){
                return ch-'0';
            }
        }
        return 0;
    }
}