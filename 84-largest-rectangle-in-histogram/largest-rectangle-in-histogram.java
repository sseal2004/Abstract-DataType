class Solution {
    public int largestRectangleArea(int[] heights) {
    //    int n = heights.length;
    //     if(n==1)return heights[0];
        Stack<Integer>stack = new Stack<>();
        int max=0;
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max = getMax(heights,stack,max,i);
            }
            stack.push(i);
        }
        int i=heights.length;
        while(!stack.isEmpty()){
            max = getMax(heights,stack,max,i);
  
        }
        return max;
    }
    static int getMax(int []arr,Stack<Integer>stack,int max,int i ){
        int area;
        int pop = stack.pop();
        if(stack.isEmpty()){
            area = arr[pop] * i;
        }
        else{
            area = arr[pop] * (i-1-stack.peek());
        }
        return Math.max(max,area);
    }
}
/*
Find the max rectangle that can be formed
til  1:max(2)
till 2:max(2,1+1)
till 3:max(1+1+1,5)
till 4:max(1+1+1+1,6,5+5,2)
till 5:max(1+1+1+1+1+1,2+2+2,10,5,2)
till 6:max(1+1+1+1+1+1,3,8,6,10,6,2)



*/