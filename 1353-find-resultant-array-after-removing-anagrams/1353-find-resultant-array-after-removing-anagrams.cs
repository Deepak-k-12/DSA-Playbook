public class Solution {
    public IList<string> RemoveAnagrams(string[] words) {
        List<String> demo=new List<String>();
        demo.Add(words[0]);

        for(int i=1;i<words.Length;i++){
            String a=demo[demo.Count-1];
            String b=words[i];

            if(!Check(a,b)){
                demo.Add(b);
            }
        }
        return demo;
    }

    public bool Check(String a,String b){
        if(a.Length!=b.Length){return false;}
        char []ch=a.ToCharArray();
        char []ch1=b.ToCharArray();
        Array.Sort(ch);
        Array.Sort(ch1);
        for(int i=0;i<ch.Length;i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
}