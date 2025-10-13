class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> demo=new ArrayList<>();
        demo.add(words[0]);

        for(int i=1;i<words.length;i++){
            String a=demo.get(demo.size()-1);
            String b=words[i];

            if(!check(a,b)){
                demo.add(b);
            }
        }
        return demo;
    }

    public boolean check(String a,String b){
        if(a.length()!=b.length()){return false;}
        char ch[]=a.toCharArray();
        char ch1[]=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
}