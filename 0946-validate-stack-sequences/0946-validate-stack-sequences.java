class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int j=0;
        while(i<pushed.length && j<popped.length){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek()==popped[j]){
                j++;
                stack.pop();
            }
            i++;
        }
        return stack.isEmpty() && i==pushed.length && j==popped.length;
    }
}