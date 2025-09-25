class Pair {
    int c;
    int in;

    Pair(int c, int in) {
        this.c = c;
        this.in = in;
    }
}

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Pair> demo=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            Pair p = demo.getOrDefault(ch, new Pair(0, i));
            p.c++;
            demo.put(ch, p);
        }
        for (int i=0;i<s.length();i++) {
            Pair p=demo.get(s.charAt(i));
            if (p.c==1) {
                return p.in;
            }
        }
        return -1;
    }
}