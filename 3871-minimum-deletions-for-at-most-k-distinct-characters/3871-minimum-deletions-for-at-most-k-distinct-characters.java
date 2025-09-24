class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character,Integer> demo=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            demo.put(c,demo.getOrDefault(c,0)+1);

        }
        if(demo.size()-k<=0){return 0;}
        int arr[]=new int[demo.size()];
        int j=0;
        for(int i:demo.values()){
            arr[j++]=i;
        }
        Arrays.sort(arr);
        int n=demo.size();
        int c=0;
        for(int i:arr){
            n--;
            if(n==k){
                c+=i;
                return c;
            }
            c+=i;
        }

        return c;  
}}