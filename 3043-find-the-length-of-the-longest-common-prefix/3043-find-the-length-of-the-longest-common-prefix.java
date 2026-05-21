class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> set = new HashSet<>();

        int max = 0;

        for (int num : arr1) {

            String s = num + "";
            String temp = "";

            for (int i = 0; i < s.length(); i++) {
                temp += s.charAt(i);
                set.add(temp);
            }
        }

        for (int num : arr2) {

            String s = num + "";
            String temp = "";

            for (int i = 0; i < s.length(); i++) {

                temp += s.charAt(i);

                if (set.contains(temp)) {
                    max = Math.max(max, temp.length());
                }
            }
        }

        return max;
    }
}