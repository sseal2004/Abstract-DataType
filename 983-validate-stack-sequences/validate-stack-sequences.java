class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int i=0;
        for(int val:pushed){
            s.push(val);
            while(!s.isEmpty() && s.peek() == popped[i] ){
                s.pop();
                i++;

            }
        }
        return s.isEmpty();//return false as default
    }
}