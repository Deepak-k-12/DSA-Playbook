class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=1;i<=n;i++){
            str.append(i);
        }
        ArrayList<String> ans=new ArrayList<>();
        check(0,str,ans,k);
        return ans.get(ans.size()-1);

    }

    public void check(int ind,StringBuilder str,ArrayList<String> ans,int k){
        if(ind==str.length()){
            ans.add(str.toString());
            return;
        }
        if(ans.size()==k){return;}
        
        for(int i=ind;i<str.length();i++){
            char c=str.charAt(i);
            str.deleteCharAt(i);
            str.insert(ind,c);
            check(ind+1,str,ans,k);
            str.deleteCharAt(ind);
            str.insert(i,c);
        }
    }

   
}