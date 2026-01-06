class Solution {
    public boolean checkString(String s) {
        int a=s.lastIndexOf('a');
        int b=s.indexOf('b');
        if (a == -1 || b == -1) return true;
        return a<b;
    }
}