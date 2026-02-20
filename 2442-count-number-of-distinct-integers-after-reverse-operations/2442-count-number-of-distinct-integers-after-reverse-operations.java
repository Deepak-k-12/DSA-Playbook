class Solution {
    public int countDistinctIntegers(int[] nums) {
      HashSet<Integer> set=new HashSet<>();
      for(int i:nums){
        set.add(i);
        set.add(reverse(i));
      }
      return set.size();   
    }

    public int reverse(int num){
        int sum=0;
        while(num>0){
            sum=sum*10+(num%10);
            num=num/10;
        }
        return sum;
    }
}