class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> demo=new ArrayList<>();
        solve(0,s,ans,demo);
        return ans;
    }
    public void solve(int ind,String s,List<List<String>> ans,List<String> demo){
        if(ind==s.length()){
            ans.add(new ArrayList<>(demo));
            return;
        }

        for(int i=ind;i<s.length();i++){
            if(is_palindrome(s,ind,i)){
                demo.add(s.substring(ind,i+1));
                solve(i+1,s,ans,demo);
                demo.remove(demo.size()-1);
            }
        }
    }

    public boolean is_palindrome(String s,int st,int ed){
        while(st<=ed){
            if(s.charAt(st)!=s.charAt(ed)){return false;}
            st++;
            ed--;
        }
        return true;
    }
}