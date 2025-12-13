class Solution {
    public int countCollisions(String dir) {
        Stack<Character> demo = new Stack<>();
        int count = 0;
        int flag;

        for (int i = 0; i < dir.length(); i++) {
            char ch = dir.charAt(i);
            flag = 1;

            if (demo.isEmpty() && ch == 'L') {
                continue;
            }

            while (!demo.isEmpty()) {
                char ch1 = demo.pop();

                if (ch1 == 'R' && ch == 'L') {
                    count += 2;
                    ch = 'S';
                    flag = 0;
                }

                else if (ch1 == 'R' && ch == 'S') {
                    count += 1;
                    flag = 0;
                }

                else if (ch1 == 'S' && ch == 'L') {
                    count += 1;
                    ch = 'S';
                    flag = 0;
                }

                else if (ch1 == 'S' && ch == 'R') {
                    demo.push(ch1);
                    break;
                }

                else if (ch1 == 'R' && ch == 'R') {
                    demo.push(ch1);
                    break;
                }

                else if (ch1 == 'L' && ch == 'L') {
                    demo.push(ch1);
                    break;
                }

                else if (ch1 == 'L' && ch == 'S') {
                    demo.push(ch1);
                    break;
                }

                else {
                    demo.push(ch1);
                    break;
                }
            }

            if (flag == 0) {
                demo.push('S');
            } else {
                demo.push(ch);
            }
        }
        return count;
    }
}
