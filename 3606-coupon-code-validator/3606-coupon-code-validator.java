class Solution {
    public List<String> validateCoupons(String[] code, String[] Line, boolean[] isActive) {
        
        ArrayList<String> ans=new ArrayList<>();
        HashMap<String, List<String>> demo = new HashMap<>();
        demo.put("electronics", new ArrayList<>());
        demo.put("grocery", new ArrayList<>());
        demo.put("pharmacy", new ArrayList<>());
        demo.put("restaurant", new ArrayList<>());

        HashSet<String> allowed = new HashSet<>();
        allowed.add("electronics");
        allowed.add("grocery");
        allowed.add("pharmacy");
        allowed.add("restaurant");
        for(int i=0;i<code.length;i++){
            if(!check(code[i])){continue;}
            if(!allowed.contains(Line[i])){continue;}
            if(!isActive[i]){continue;}

            demo.get(Line[i]).add(code[i]);
        }

        String [] str={"electronics", "grocery", "pharmacy", "restaurant"};
        for(String i:str){
            List<String> a=demo.get(i);
            Collections.sort(a);
            ans.addAll(a);
        }
        return ans;
    }


    public boolean check(String c){
        if(c.length()==0){return false;}
        for(char i:c.toCharArray()){
            if(!(Character.isLetterOrDigit(i) || i=='_')){
                return false;
            }
        }
        return  true;
    }
}