class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int next=helper1(words,target,startIndex);
        if (next==-1) return -1;
        int prev=helper2(words,target,startIndex);
        return Math.min(next,prev);
    }

    public int helper1(String[] words, String target, int st){
        if(words[st].equals(target)) return 0;
            int i=st+1;
            int steps=1;
            while(true){
            i=(i%words.length);
            if(st==i) return -1;
            if(words[i].equals(target)) return steps;
            i+=1;
            steps+=1;
        }
    }

    public int helper2(String[] words, String target, int st){
        if(words[st].equals(target)) return 0;
        int i=st-1;
        int n=words.length;
        int steps=1;
        while(true){
            i=(i+n)%n;
            if(st==i) return -1;
            if(words[i].equals(target)) return steps;
            steps+=1;
            i-=1;
        }
    }
}