import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();

        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length) return false;

        for(int i=0;i<pattern.length();i++){

            map1.putIfAbsent(pattern.charAt(i), i);
            map2.putIfAbsent(arr[i], i);

            if(!map1.get(pattern.charAt(i)).equals(map2.get(arr[i])))
                return false;
        }

        return true;
    }
}