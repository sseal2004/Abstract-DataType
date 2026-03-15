class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer>mono = new Stack();
        int n = heights.length;
        for(int i=n-1;i>=0;--i){
            int h =heights[i],count=0;
            for(;!mono.isEmpty()&& mono.peek()<h;++count)
                mono.pop();
        heights[i] = count + (mono.isEmpty() ? 0 : 1);
        mono.push(h);    
        }
        return heights;
    }
}