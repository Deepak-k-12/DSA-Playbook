class Solution {
    public String repeatLimitedString(String s, int limit) {
        StringBuilder sb=new StringBuilder();
        int freq[]=new int [26];

        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            freq[ind]+=1;
        }
        for(int i=25;i>=0;i--){
            if(freq[i]==0) continue;
            if(freq[i]<=limit){
                char ch=(char) (97+i);
                sb.append((ch+"").repeat(freq[i]));
                freq[i]=0;
            }
            else if(freq[i]>limit){
                char ch=(char) (97+i);
                sb.append((ch+"").repeat(limit));
                freq[i]-=limit;
                boolean check=solve(freq,sb,i-1);
                if(!check) break;
                i=i+1;
            }
        }
        return sb.toString();
    }
    
    public boolean solve(int []freq,StringBuilder sb,int st){
        for(int i=st;i>=0;i--){
            if(freq[i]>0){
                char ch=(char) (97+i);
                sb.append(ch+"");
                freq[i]-=1;
                return true;            }
        }
        return false;
    }

}