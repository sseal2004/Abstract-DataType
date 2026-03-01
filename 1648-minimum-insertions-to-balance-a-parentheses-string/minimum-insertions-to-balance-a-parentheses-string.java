class Solution {
    public int minInsertions(String s) {
       int  insert=0;
       Stack<Character>stack = new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='('){
            stack.push(ch);
        }else{

            if(i+1<s.length()&&s.charAt(i+1)==')')i++;
            else insert++;

            if(!stack.isEmpty())stack.pop();
            else insert++;
        }

       }
       return insert+ 2*stack.size(); 
       
    }
}