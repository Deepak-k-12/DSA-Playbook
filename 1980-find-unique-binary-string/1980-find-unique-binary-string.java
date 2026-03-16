import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {

        HashSet<Integer> ans = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int len = nums[0].length();

        for(String i : nums){
            int val = Integer.parseInt(i, 2);
            min = Math.min(min, val);
            ans.add(val);
        }

        while(true){

            if(!ans.contains(min)){
                String str = Integer.toBinaryString(min);
                if(str.length() > len){
                    min = 0;
                    continue;
                }

                StringBuilder w = new StringBuilder();
                for(int i = 0; i < (len - str.length()); i++){
                    w.append('0');
                }

                return w.toString() + str;
            }

            min++;
        }
    }
}