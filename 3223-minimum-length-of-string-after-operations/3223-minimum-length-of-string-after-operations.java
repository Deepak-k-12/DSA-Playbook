class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))==3){
                count+=2;
                map.put(s.charAt(i),1);
            }
        }
        return s.length()-count;
    }
}