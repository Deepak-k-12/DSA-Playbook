class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);;
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> q=new PriorityQueue<>(
            (a,b)->{
                return map.get(b)-map.get(a);
            }
        );

        for(char ch:map.keySet()){
            q.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            char ch=q.poll();
            int freq=map.get(ch);
            while(freq!=0){
                sb.append(ch);
                freq-=1;
            }
        }

        return sb.toString();
    }
}