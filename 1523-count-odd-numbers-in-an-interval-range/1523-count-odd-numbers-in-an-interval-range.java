class Solution {
    public int countOdds(int low, int high) {
        int l=(low)/2;
        int r=(high+1)/2;
        return r-l;
    }
}