public class Solution {
    public long RemoveZeros(long n) {
        StringBuilder str=new StringBuilder();
        str.Append(n);
        int i=0;
        int len=str.Length;
        while(i<len){
            if(str[i]=='0'){
                str.Remove(i,1);
                len--;
            }
            else{
                i++;
            }
        }
        long ans=long.Parse(str.ToString());
        return ans;
    }
}