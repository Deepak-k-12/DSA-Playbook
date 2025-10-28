class Solution {
    public int nextBeautifulNumber(int n) {
        n+=1;
        HashMap<Character,Integer> demo=new HashMap<>();
        while(true){
            StringBuilder b=new StringBuilder();
            b.append(n);
            demo.clear();
            for(int i=0;i<b.length();i++){
                demo.put(b.charAt(i),demo.getOrDefault(b.charAt(i),0)+1);
            }
            boolean check=true;
            for(char c:demo.keySet()){
                if((c-'0')!=demo.get(c)){
                    check=false;
                    break;
                }
            }
            int val = Integer.parseInt(b.toString());
            if(check){return val;}
            n+=1;
           
        }
    }
}