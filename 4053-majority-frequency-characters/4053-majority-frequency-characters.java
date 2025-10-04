class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> demo = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            demo.put(s.charAt(i), demo.getOrDefault(s.charAt(i), 0) + 1);
        }
        TreeMap<Integer, ArrayList<Character>> demo1 = new TreeMap<>(Collections.reverseOrder());
        for (Character i : demo.keySet()) {
            int in = demo.get(i);
            demo1.putIfAbsent(in, new ArrayList<>());
            demo1.get(in).add(i);
        }
        int m = 0, s1 = 0;
        for (int i : demo1.keySet()) {
            if (demo1.get(i).size() > m) {
                s1 = i;
                m = demo1.get(i).size();
            }
        }
        ArrayList<Character> a = demo1.get(s1);
        StringBuilder sb = new StringBuilder();
        for (Character c : a) {
            sb.append(c);
        }

        return sb.toString();

    }
}