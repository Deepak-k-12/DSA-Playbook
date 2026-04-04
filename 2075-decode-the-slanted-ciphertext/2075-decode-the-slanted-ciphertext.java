class Solution {
    public String decodeCiphertext(String text, int rows) {
        if(text.length()==1) return text.charAt(0)+"";
        int col=text.length()/rows;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int j=0,c=0;
        boolean first=true;
        for(int i=0;i<text.length();i++){
            if(first){
            map.put(j, new ArrayList<>());
            map.get(j).add(i);
            }
            else{
                if((j-c)>=0){
                    map.get(j-c).add(i);
                }
            }
            j++;
            if(j==col){
                j=0;
                c+=1;
                first=false;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int key=0;key<col;key++){
            List<Integer> idx=map.get(key);
            for(int i:idx){
                char ch=text.charAt(i);
                 sb.append(ch);
            }
        }
        return sb.toString().stripTrailing();
    }
}