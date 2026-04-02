class Solution {

    public class Pair {
        int x;
        char y;

        Pair(int x, char y) {
            this.x = x;
            this.y = y;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String dir) {

        Map<Integer, Pair> map = new HashMap<>();
        Map<Integer, Integer> indexMap = new HashMap<>(); 

        for (int i = 0; i < healths.length; i++) {
            map.put(positions[i], new Pair(healths[i], dir.charAt(i)));
            indexMap.put(positions[i], i);
        }

        Arrays.sort(positions);

        Stack<Pair> s1 = new Stack<>();

        for (int i : positions) {

            // if (!map.containsKey(i)) continue;

            char ch = map.get(i).y;

            while (!s1.isEmpty() && ch == 'L' && s1.peek().y == 'R') {

                int val = s1.peek().x;

                int curr = map.get(i).x;
                int prev = map.get(val).x;

                if (curr > prev) {
                    s1.pop();
                    map.remove(val);
                    map.put(i, new Pair(curr - 1, 'L'));
                }
                else if (prev > curr) {
                    map.put(val, new Pair(prev - 1, 'R'));
                    map.remove(i);
                    break;
                }
                else {
                    s1.pop();
                    map.remove(val);
                    map.remove(i);
                    break;
                }
            }

            if (map.containsKey(i)) {
                s1.push(new Pair(i, ch));
            }
        }

        int[] ans = new int[positions.length];
        Arrays.fill(ans, -1);

        for (int pos : map.keySet()) {
            int idx = indexMap.get(pos);
            ans[idx] = map.get(pos).x;
        }

        List<Integer> res = new ArrayList<>();
        for (int val : ans) {
            if (val != -1) res.add(val);
        }

        return res;
    }
}