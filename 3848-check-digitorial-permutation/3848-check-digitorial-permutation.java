class Solution {
    ArrayList<Integer> fact=new ArrayList<>();
    public boolean isDigitorialPermutation(int n) {
        int cal=calculate(9);
        int fact=get(n);
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int val=n%10;
            map.put(val,map.getOrDefault(val,0)+1);
            n/=10;
        }
        while(fact>0){
            int val=fact%10;
            if(!map.containsKey(val)){return false;}
            map.put(val,map.get(val)-1);
            if(map.get(val)==0){
                map.remove(val);
            }
            fact/=10;
        }
        return map.size()==0;
    }

    public int calculate(int n){
       if(n==0){
        fact.add(1);
        return 1;
       }

       int ans=n*calculate(n-1);
       fact.add(ans);
       return ans;

    }

    public int get(int num){
        int sum=0;
        while(num>0){
            sum+=fact.get(num%10);
            num/=10;
        }
        return sum;
    }

}