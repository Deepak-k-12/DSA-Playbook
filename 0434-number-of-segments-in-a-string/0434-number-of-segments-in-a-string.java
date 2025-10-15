class Solution {
    public int countSegments(String s) {
        if(s==null||s.trim().isEmpty()) return 0;
        String[]str=s.trim().split("\\s+");
        return str.length;
    }
}