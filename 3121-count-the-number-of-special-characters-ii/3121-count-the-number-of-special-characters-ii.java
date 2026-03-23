class Solution {
    public int numberOfSpecialChars(String word) {
        int c = 0;
        boolean[] used = new boolean[26];

        int[] firstUpper = new int[26];
        int[] lastLower = new int[26];

        for (int i = 0; i < 26; i++) {
            firstUpper[i] = -1;
            lastLower[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                int idx = ch - 'A';
                if (firstUpper[idx] == -1) firstUpper[idx] = i;
            } else {
                int idx = ch - 'a';
                lastLower[idx] = i;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                int idx = ch - 'A';
                if (used[idx]) continue;

                int in = lastLower[idx];
                int in1 = firstUpper[idx];

                if (in != -1 && in < in1) {
                    c++;
                    used[idx] = true;
                }
            }
        }
        return c;
    }
}